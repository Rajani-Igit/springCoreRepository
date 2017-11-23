package com.awareinjection.beans;

public class HighFrequencyReciver implements Reciver {

	@Override
	public void recive() {
		// TODO Auto-generated method stub
		System.out.println("reciver recived the frequency");
	}

	@Override
	public String tune(float frequency) {
		return "playing the station  "+frequency;
	}

}
