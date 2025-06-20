package session8;

import java.util.HashMap;

public class Zoo1 <T> {
	HashMap<T, Integer> zooInhabitants = new HashMap <T, Integer>();

	void addAnimal(T t) {
		if(!zooInhabitants.containsKey(t)) {
			int size = zooInhabitants.size();
			zooInhabitants.put(t, size+1);
		}
	}
}
