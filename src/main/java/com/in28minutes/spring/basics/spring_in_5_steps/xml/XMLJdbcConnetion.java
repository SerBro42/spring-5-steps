package com.in28minutes.spring.basics.spring_in_5_steps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class XMLJdbcConnetion {
	public XMLJdbcConnetion() {
		System.out.println("XML JDBC Connection");
	}

}
