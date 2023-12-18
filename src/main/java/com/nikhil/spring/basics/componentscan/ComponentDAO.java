package com.nikhil.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentJDBCConnection jdbcConnection;

    public ComponentJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @Component
    // Doesn't have any effect because personDAO is singleton so the reference to jdbcconnection will not change so use proxy in this case
    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
    public static class ComponentJDBCConnection {
        public ComponentJDBCConnection(){
            System.out.println("JDBC Connection");
        }
    }
}
