package com.masai.app.component;

import org.springframework.beans.factory.annotation.Value;

public class PropertyComponent {

	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "PropertyComponent [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	public PropertyComponent(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public PropertyComponent() {
		super();
		
	}
	
	
	
}
