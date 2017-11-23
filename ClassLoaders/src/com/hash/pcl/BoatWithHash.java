package com.hash.pcl;

public class BoatWithHash {
public int id;
public String location;
public BoatWithHash(int id, String location) {
	super();
	this.id = id;
	this.location = location;
}
/*@Override
public String toString() {
	return "BoatWithHash [id=" + id + ", location=" + location + "]";
}*/
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	return result;
}
}
