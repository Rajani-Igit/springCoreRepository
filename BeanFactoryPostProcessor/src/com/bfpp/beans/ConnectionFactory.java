package com.bfpp.beans;

import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ConnectionFactory  {
private String driverClassName;
private String url;
private String userName;
private String password;
public String getDriverClassName() {
	return driverClassName;
}
public void setDriverClassName(String driverClassName) {
	this.driverClassName = driverClassName;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	System.out.println("Connection Factory toString method called");
	return "ConnectionFactory [driverClassName=" + driverClassName + ", url=" + url + ", userName=" + userName
			+ ", password=" + password + "]";
}

}
