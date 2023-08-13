package com.example.cloud.gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallbackMethod")
    public String userServiceFallbackMethod(){
        return  "User service is down / taking longer then expected.";
    }
    @GetMapping("/dependencyServiceFallbackMethod")
    public String dependencyServiceFallbackMethod(){
        return " Dependency service is down / taking longer than expected";
    }
}
