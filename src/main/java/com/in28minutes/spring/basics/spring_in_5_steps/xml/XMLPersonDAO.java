package com.in28minutes.spring.basics.spring_in_5_steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {
	
	XMLJdbcConnetion xmlJdbcConnection;

	public XMLJdbcConnetion getXMLJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXMLJdbcConnection(XMLJdbcConnetion jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}
	
	
	
}
