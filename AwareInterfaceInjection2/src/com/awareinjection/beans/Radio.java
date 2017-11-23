package com.awareinjection.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Radio implements BeanFactoryAware {
	private BeanFactory factory;
	private float frequency;
	

	/**
	 * Acessor methods for frequency
	 */
	public float getFrequency() {
		return frequency;
	}
	
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	/**
	 * Play method will play the station based on the frequency
	 */
	
    public void play() {
	 if(frequency <= 100) {
		 LowFrequencyReciver lowFrequency = factory.getBean("lowFrequency", LowFrequencyReciver.class);
		 String str = null;
		 str = lowFrequency.tune(frequency);
		 System.out.println(str);
	 }
	 else {
		 HighFrequencyReciver  highFrequency = factory.getBean("highFrequency", HighFrequencyReciver.class);
		 String str = null;
		 str = highFrequency.tune(frequency);
		 System.out.println(str);
	 }
    }
    
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		// TODO Auto-generated method stub
		this.factory = factory;
	}
}
