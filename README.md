
# 深入浅出springboot2.X

## 走过的坑

### 1.配置jsp视图时，总跳转不到页面
> 原因，pom文件里面 resouces搞的鬼
  build下添加
```xml
<resources>
   <resource>
      <directory>src/main/java</directory>
      <includes>
         <include>**/*.xml</include>
      </includes>
   </resource>
   <resource>
      <directory>src/main/resources</directory>
      <includes>
         <include>**/*.*</include>
      </includes>
   </resource>
   <resource>
      <directory>src/main/webapp</directory>
      <targetPath>META-INF/resources</targetPath>
      <includes>
         <include>**/*.*</include>
      </includes>
   </resource>
</resources>
```
配置的参考链接:
按照这个链接配置保证没问题:
    https://www.cnblogs.com/netcorner/p/10494913.html   
    


