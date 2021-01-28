import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("I'm");
		arrayList.add("On");
		arrayList.add("Learning");
		arrayList.add("Java");
		arrayList.add("Programming");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");	
		}		
	}
}
