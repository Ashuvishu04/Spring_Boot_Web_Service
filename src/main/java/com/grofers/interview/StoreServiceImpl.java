package com.grofers.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.grofers.interview.model.Store;

@Service
public class StoreServiceImpl implements StoreService {

	Map<Long,String> stores = new HashMap<>();
	Store store = new Store();
	long currentId = 1;
	
	public StoreServiceImpl() {
		init();
	}
	
	void init() {
		store.setKey(currentId);
		store.setValue("Toffee");
		stores.put(store.getKey(), store.getValue());
	}

	@Override
	public String get(long key) {
		String value = stores.get(key);
		return value;
	}

	@Override
	public Response set(long key, String value) {
		store.setKey(key);
		store.setValue(value);
		stores.put(key, value);
		return Response.ok(stores.get(key)).build();
	}

	@Override
	public Response updateKey(long key, String value) {
		Set<Long> alreadyExistingkey = stores.keySet();
		if(alreadyExistingkey.contains(key)) {
			stores.put(key, value);
			Response.ok().build();
		}
		else {
			Response.notModified().build();
		}
		return null;
	}
	
}
