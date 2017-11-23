package com.fa.beans;

public class MessageWriter {
private IMessageConverter messageConverter;

public void setMessageConverter(IMessageConverter messageConverter) {
	this.messageConverter = messageConverter;
}
 public void writeMessage(String message)
 {
	 String cmessage=null;
	 cmessage=messageConverter.convert(message);
	 System.out.println(cmessage);
 }

}
