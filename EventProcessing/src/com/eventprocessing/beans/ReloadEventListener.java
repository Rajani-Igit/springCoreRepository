package com.eventprocessing.beans;

import org.springframework.context.ApplicationListener;

public class ReloadEventListener implements ApplicationListener<ReloadEvent> {
	@Override
	public void onApplicationEvent(ReloadEvent reloadEvent) {
		System.out.println("In side the Listener ");
		System.out.println("Listener called and the table name is "+reloadEvent.getTableName());
	}
}
