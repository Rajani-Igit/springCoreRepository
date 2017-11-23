package com.cdi.beans;

import java.util.Map;
import java.util.Properties;
public class Organization {
private Map<String,Meeting> schedular;
private Properties hostName;
public Organization(Properties hostName) {
	super();
	this.hostName = hostName;
}
public void setSchedular(Map<String, Meeting> schedular) {
	this.schedular = schedular;
}
@Override
public String toString() {
	return "Organization [schedular=" + schedular + ", hostName=" + hostName + "]";
}

}
