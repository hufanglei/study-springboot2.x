package com.hfl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Controller
//@EnableAutoConfiguration

@SpringBootApplication
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
