package com.eventprocessing.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UpdateCitys implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher apa;
  public void reloadCity(int id,String cityName) {
	  System.out.println("we are updating city id is "+id +"  city Name is "+cityName);
	  ReloadEvent reloadEvent = new ReloadEvent(this,"tbl_city");
	  apa.publishEvent(reloadEvent);
  }

@Override
public void setApplicationEventPublisher(ApplicationEventPublisher apa) {
	this.apa = apa;
	System.out.println("This is ApplicationEventPublisher");
}
}
