package com.hash.pcl;

public class BoatWithOut {
	public int id;
	public String location;
	public  BoatWithOut(int id, String location) {
		this.id = id;
		this.location = location;
	}
	@Override
	public String toString() {
		return "BoatWithOut [id=" + id + ", location=" + location + "]";
	}
}
