package com.dependson.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dependson.util.IAcessor;

/**
 *CacheManager class is used for seprating the loading logic from cache 
 *insted of cache class loading by itself if cache Manager will load the data into hashmap 
 *it will also face the same problems
 *so in that case it will ask Acessor class to load the data into cache class
 *for each and every Source means weather it may be from properties or jdbc we have to create the 
 *one seprator class.inorder to provide the modularity 
 */
public class CacheManager {
	/**
	 * This normal hashmap is used for storeing the Acessor objects
	 * it is normal hashmap if we go for concurrent hashmap.this normal hashmap we have to store at one shot
	 * into the concurrent hashmap
	 * Bcz there are multiple no of Acessor Objects are there.so if we store one by one in concurrent 
	 * HashMap it has to acuired the lock multiple times so performence will be degraded
	 */
	private Map<String,Object> dataMap;
	private List<IAcessor> listAcessors;
    private Cache cache;

    /**
     *This constructor is used for initializing this class object wilth list of acessor objects and cache object 
     *cache object is manadatory bcz to insert values into the Cache object
     */
public CacheManager(List<IAcessor> listAcessors,Cache cache) {
	 this.listAcessors = listAcessors;
	 this.cache = cache;
     dataMap = new HashMap<String,Object>();
	 load();
}

/**
 *This method is called by only once bcz we are calling it from constructor
 *bcz we should not write the logic inside constructor bcz if you want to load the updated values file
 *we can not bcz object will be created only once that is the reason we have to provide 
 *entire logic inside the method and we have to call that method from constructor
 *inside this method we have to iterate the group of acessor objects one by one and 
 *readthe keys and values ond store those values inside normal map
 *and load that data into the Concurrent HashMap at one shot
 */
public void load() {
	for(IAcessor acessor : listAcessors) {
		dataMap.put(acessor.geyKey(), acessor.getData());
	}
	System.out.println("Normal HashMap from CacheManager is "+dataMap);
	cache.putAll(dataMap);
}
}
