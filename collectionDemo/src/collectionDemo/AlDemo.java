package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AlDemo {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(73);
al.add(45);
System.out.println(al);
Collections.sort(al);
System.out.println(al);
Iterator it=al.iterator();
System.out.println(it.next());
System.out.println(it.next());
System.out.println(it.hasNext());
	}

}
