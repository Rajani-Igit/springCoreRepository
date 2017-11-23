package com.hash.pcl;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TripWithHash {
	public BoatWithHash bwHash;
    public TripWithHash(BoatWithHash bwHash) {
		super();
		this.bwHash = bwHash;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bwHash == null) ? 0 : bwHash.hashCode());
	return result;
}
public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	BoatWithHash bwHash1 = new BoatWithHash(10,"Hyderabad");
	BoatWithHash bwHash2 = new BoatWithHash(10,"Hyderabad");
	
	TripWithHash trip1 = new TripWithHash(bwHash1);
	TripWithHash trip2 = new TripWithHash(bwHash2);
	
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
