package com.hash.pcl;

public class BoatWithEquals {
	public int id;
	public String location;
	public BoatWithEquals(int id, String location) {
		super();
		this.id = id;
		this.location = location;
	}
	/*@Override
	public String toString() {
		return "BoatWithHash [id=" + id + ", location=" + location + "]";
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoatWithEquals other = (BoatWithEquals) obj;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	
}
