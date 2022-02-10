package com.examples.spring.boot.core.profile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnectionConfig {
	
	@Value("${dbname}")
	private String dbname;
	
	@Value("${host}")
	private String host;
	
	@Value("${port}")
	private String port;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
}
