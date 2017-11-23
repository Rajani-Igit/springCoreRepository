package com.hash.pcl;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TripWithEquals {
	public BoatWithEquals bwEquals;
	
    public TripWithEquals(BoatWithEquals bwEquals) {
		super();
		this.bwEquals = bwEquals;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TripWithEquals other = (TripWithEquals) obj;
		if (bwEquals == null) {
			if (other.bwEquals != null)
				return false;
		} else if (!bwEquals.equals(other.bwEquals))
			return false;
		return true;
	}


public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	BoatWithEquals bwHash1 = new BoatWithEquals(10,"Hyderabad");
	BoatWithEquals bwHash2 = new BoatWithEquals(10,"Hyderabad");
	
	TripWithEquals trip1 = new TripWithEquals(bwHash1);
	TripWithEquals trip2 = new TripWithEquals(bwHash2);
	
	System.out.println(trip1.equals(trip2));
	System.out.println(trip1 == trip2);
	
	System.out.println("trip1 reference variables  "+trip1);
	System.out.println("trip2 reference variables  "+trip2);
	
	System.out.println("Trip1 hashcode is  "+trip1.hashCode());
	System.out.println("Trip2 hashcode is  "+trip2.hashCode());
	
	System.out.println("Boat1 hashcode is  "+bwHash2.hashCode());
	System.out.println("Boat2 hashcode is  "+bwHash1.hashCode());
	
	
	
	HashMap hashMap = new HashMap();
	hashMap.put(trip1, bwHash1);
	hashMap.put(trip2, bwHash2);
	
	trip1.buckets(hashMap);
	
	System.out.println(hashMap);
	System.out.println(hashMap);
}
private void buckets(HashMap m) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    // Pull out the table.
    Field f = m.getClass().getDeclaredField("table");
    f.setAccessible(true);
    Object[] table = (Object[]) f.get(m);
    int bucket = 0;
    // Walk it.
    for (Object o : table) {
        if (o != null) {
            // At least one in this bucket.
            int count = 1;
            // What's in the `next` field?
            Field nf = o.getClass().getDeclaredField("next");
            nf.setAccessible(true);
            Object n = nf.get(o);
            if (n != null) {
                do {
                    // Count them.
                    count += 1;
                } while ((n = nf.get(n)) != null);
            }
            System.out.println("Bucket " + bucket + " contains " + count + " entries");
        }
        bucket += 1;
    }
}

/*@Override
public String toString() {
	return "TripWithHash [bwHash=" + bwHash + "]";
}*/
}
