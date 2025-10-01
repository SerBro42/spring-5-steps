package com.in28minutes.spring.basics.spring_in_5_steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JdbcConnetion {
	public JdbcConnetion() {
		System.out.println("JDBC Connection");
	}

}
