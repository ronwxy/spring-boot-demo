package com.snail.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/hello") 
public class HelloWorldController {
	
	@RequestMapping("/{user}")  
    public String view(@PathVariable("user") String user) {  
        return "hello, " + user;  
    }  

}
