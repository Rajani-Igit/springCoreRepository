package com.fa.beans;

public class PDFMessageConverter implements IMessageConverter{

	public String convert(String message) {
		
		// logic
		return "<pdf> "+ message+" </pdf>";
	}

}
