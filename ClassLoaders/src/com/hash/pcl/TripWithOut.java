package com.hash.pcl;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TripWithOut {
	public BoatWithOut boatWithOut;
	public TripWithOut(BoatWithOut boatWithOut) {
		this.boatWithOut=boatWithOut;
	}
public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	BoatWithOut b1=new BoatWithOut(10,"Hyderabad");
	BoatWithOut b2=new BoatWithOut(10,"Hyderabad");
	TripWithOut trip1 = new TripWithOut(b1);
	TripWithOut trip2 = new TripWithOut(b2);
	
	System.out.println(trip1.equals(trip2));
	System.out.println(trip1 == trip2);
	
	System.out.println("TripWithOut1 HashCode is  "+trip1.hashCode());
	System.out.println("TripWithOut2 HashCode is  "+trip2.hashCode());
	
	
	System.out.println("BoatWithOut1 HashCode is  "+b1.hashCode());
	System.out.println("BoatWithOut2 HashCode is  "+b2.hashCode());
	
	HashMap hashMap = new HashMap();
	hashMap.put(trip1, b1);
	hashMap.put(trip2, b2);
	
	trip1.buckets(hashMap);
	
	System.out.println(hashMap);
	
}
@Override
public String toString() {
	return "TripWithOut [boatWithOut=" + boatWithOut + "]";
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

}
