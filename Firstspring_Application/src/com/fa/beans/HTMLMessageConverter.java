package com.fa.beans;

public class HTMLMessageConverter implements IMessageConverter {
	public String convert(String message) {	
		// some logic
		return "<html><body> "+message+" </body></html>";
	}

}
