package collectionDemo;

import java.util.ArrayList;

public class AddElements {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add(4);
al.add("mala");
System.out.println(al);
ArrayList al2=new ArrayList();
al2.add(100);
al2.add("anand");
System.out.println(al2);
al.addAll(al2);
System.out.println(al);
	}

}
