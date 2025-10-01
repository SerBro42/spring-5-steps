package com.in28minutes.spring.basics.spring_in_5_steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//We enable a proxy, so that every time a PersonDAO bean is used, a different JdbcConnection is instantiated, rather than using always the same
//Normally, when a dependency is a PROTOTYPE, but the bean using it is not a PROTOTYPE, the instance of the dependency is always the same. With Proxy, a 
//different instance of the dependency is used every time we call the bean.
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnetion {
	public JdbcConnetion() {
		System.out.println("JDBC Connection");
	}

}
