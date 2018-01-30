package es.dpii.spring.scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class MyScope implements Scope {

	private Map<String, Object> objectMap = Collections.synchronizedMap(new HashMap<String, Object>());

	
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (!objectMap.containsKey(name)) {
			objectMap.put(name, objectFactory.getObject());
		}
		return objectMap.get(name);

	}

	@Override
	public String getConversationId() {		
		return "MyScope";
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {}

	@Override
	public Object remove(String name) {		
		return objectMap.remove(name);
	}

	@Override
	public Object resolveContextualObject(String arg0) {		
		return null;
	}

	public void clearBean() {
		objectMap.clear();
		
	}

}
