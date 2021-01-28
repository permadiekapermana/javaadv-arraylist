import java.util.ArrayList;
import java.util.Iterator;

public class TaskArrayList {
    public static ArrayList<String> createListIterator() {
        ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("I'm");
		arrayList.add("in");
		arrayList.add("Java");
		arrayList.add("Practice");
		return arrayList;		
	
    }

    public static void main(String[] args) {
        Iterator<String> iterator = createListIterator().iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");	
		}
    }
}
