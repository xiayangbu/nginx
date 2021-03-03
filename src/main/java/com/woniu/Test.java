package com.woniu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("test")
    public String test(){
        System.out.println("test:"+9999);
        return "test"+9999;
    }
}
