package com.nikhil.spring.basics.springpractice1.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        return url;
    }
}
