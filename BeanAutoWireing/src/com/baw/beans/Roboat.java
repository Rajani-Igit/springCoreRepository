package com.baw.beans;

public class Roboat {
	private Chip chip;
    private Sensor sensor;
	/*public Roboat()
	{
		System.out.println("Roboat con");
	}*/
    
 
    /*
	public Roboat(Chip chip) {
		this.chip=chip;
		System.out.println("Roboat con with Chip argument  "+chip);
	}*/
	   public Roboat(Sensor sensor) {
			this.sensor=sensor;
			System.out.println("Roboat con with Sensor argument  "+sensor);
		}
	
	public Roboat(Chip chip,Sensor sensor) {
		this.chip=chip;
		this.sensor=sensor;
		System.out.println("Roboat con with Chip ans sensor as  argument  "+chip);
	}
	
   /* public void setChip(Chip chip) {
		System.out.println("roboat setter called");
		this.chip = chip;
	}*/
    
	/*public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}*/

	public String toString() {
		return "Roboat [chip=" + chip + ", sensor=" + sensor + "]";
	}

 
     
}
