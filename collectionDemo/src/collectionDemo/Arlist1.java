package collectionDemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Arlist1 {

	public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add("sheela");
a.add(4);
a.add('c');
Iterator i=a.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
