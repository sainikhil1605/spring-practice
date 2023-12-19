package com.nikhil.spring.basics.springpractice1.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;




public class XMLJdbcConnection {
    public XMLJdbcConnection(){
        System.out.println("JDBC Connection");
    }
}
