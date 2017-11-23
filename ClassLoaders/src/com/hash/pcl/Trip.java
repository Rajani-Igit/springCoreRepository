package com.hash.pcl;

import java.util.HashMap;

public class Trip {
	public Boat boat;
	public Trip(Boat boat) {
		this.boat=boat;
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boat == null) ? 0 : boat.hashCode());
		System.out.println(super.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trip other = (Trip) obj;
		if (boat == null) {
			if (other.boat != null)
				return false;
		} else if (!boat.equals(other.boat))
			return false;
		return true;
	}

public static void main(String[] args) {
	Boat b1=new Boat(10,"Hyderabad");
	Boat b2=new Boat(10,"Hyderabad");
	Trip trip1 = new Trip(b1);
	Trip trip2 = new Trip(b2);
	
	System.out.println("Trip1 HashCode is  "+trip1.hashCode());
	System.out.println("Trip2 HashCode is  "+trip2.hashCode());
	
	System.out.println("Boat1 HashCode is  "+b1.hashCode());
	System.out.println("Boat2 HashCode is  "+b2.hashCode());
	
	

	  /**
	   * When ever we put Values inside HashMap first it will find out the Hascode
	   * of the key and it will check equals method 
	   * In first case if it finds hashcode is same then it will goes 
	   * to the bucket where this hash code is located and it will perform equals method with the contents
	   * It both the contents are not same it will store in the same bucket but different contents
	   * if both are equal then old content will be replace byis is the correct way of using hashmap  the new value
	   * So it is better to override hashcode() and equals methods
	   * String and other classes are over riding this method as per their requirement
	   * other wise the bucket size will become more and large no of operations 
	   * are required to perform searching operations
	   * Th
	   */
	HashMap hashMap = new HashMap();
	hashMap.put(trip1, b1);
	hashMap.put(trip2, b2);
	System.out.println(trip1);
	System.out.println(hashMap);
}

@Override
public String toString() {
	return "Trip [boat=" + boat + "]";
}
}
