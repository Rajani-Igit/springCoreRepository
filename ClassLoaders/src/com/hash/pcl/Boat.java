package com.hash.pcl;

public class Boat {
public int id;
public String location;
public Boat(int id, String location) {
	super();
	this.id = id;
	this.location = location;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Boat other = (Boat) obj;
	if (id != other.id)
		return false;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	return true;
}
@Override
public String toString() {
	return "Boat [id=" + id + ", location=" + location + "]";
}

}
