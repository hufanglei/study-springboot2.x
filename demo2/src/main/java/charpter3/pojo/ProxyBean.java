package charpter3.pojo;

import charpter3.interceptor.Interceptor;
import charpter3.interceptor.MyInterceptor;
import charpter3.invoke.Invocation;
import charpter3.service.HelloService;
import charpter3.service.impl.HelloServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBean implements InvocationHandler {

    private Object target = null;
    private Interceptor interceptor = null;


    /**
     * 绑定代理对象
     * @param target 被代理对象
     * @param interceptor 拦截器
     * @return
     */
   public   static Object getProxyBean(Object target, Interceptor interceptor){
       ProxyBean proxyBean = new ProxyBean();
       //保存被代理对象
       proxyBean.target = target;
       //保存拦截器
       proxyBean.interceptor = interceptor;
       //生成代理对象
       Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxyBean);
       return proxy;
     }

    /**
     * 处理代理对象方法逻辑
     * @param proxy 代理对象
     * @param method 当前方法
     * @param args 运行参数
     * @return 方法调用结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //异常标识
        boolean exceptionFlag  = false;
        Invocation invocation = new Invocation(target, method, args);
        Object retObj = null;
        try{
            if(this.interceptor.before()){
                retObj = this.interceptor.around(invocation);
            }else{
                retObj  = method.invoke(target, args);
            }
        }catch (Exception e){
            //产生异常
            exceptionFlag = true;
        }
        this.interceptor.after();
        if(exceptionFlag){
            this.interceptor.afterThrowing();
        }else{
            this.interceptor.afterReturning();
            return retObj;
        }
        return null;
    }

    @Test
    public  void testProxy(){
        HelloServiceImpl helloService = new HelloServiceImpl();
        //按照约定获取proxy
        HelloService proxy = (HelloService)ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("zhangsan");
//        System.out.println("#################################name is null#####################");
//        proxy.sayHello(null);
    }
}
