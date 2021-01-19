package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * DemoController
 */

@RestController
@Slf4j
@RequestMapping("/rest")
public class DemoController {

    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable String msg){
        //msg = "123";
        //log.info("Received {}",msg);
        System.out.println("hello "+msg);
        return msg;
    }
}