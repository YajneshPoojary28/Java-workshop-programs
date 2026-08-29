package TreeSetPack;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Z");
		t.add("A");
		t.add("S");
		t.add("G");
		t.add("A");
		
		for(String data : t)
			System.out.println(data);
		
	}

}
