package charpter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//@Controller
//@EnableAutoConfiguration

@SpringBootApplication
@PropertySource(value={"classpath:jdbc.properties"},ignoreResourceNotFound=true)
public class ChapterlMain {

//    @RequestMapping("/test")
//    @ResponseBody
//    public Map<String, String> test(){
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("key", "value");
//        return map;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ChapterlMain.class, args);
    }
}
