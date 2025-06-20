package session8;

import java.util.HashMap;

public class Zoo {
	HashMap<Mammal, Integer> zooInhabitants = new HashMap <Mammal, Integer>();
	
	void addAnimal(Mammal m) {
		if(!zooInhabitants.containsKey(m)) {
			int size = zooInhabitants.size();
			zooInhabitants.put(m, size+1);
		}
	}

}
