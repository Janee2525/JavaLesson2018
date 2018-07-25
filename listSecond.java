import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class listSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List listA = new ArrayList();
		Logger l = Logger.getLogger("Test");
		
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		
		listA.add(0, "element 0");
		
		//using for-loop #1
		/* String [] arrayListA = new String [listA.size()] ;
		
		for (int i = 0; i < listA.size(); i++ ) {
			   //arrayListA[i] = (String) listA.get(i);
			   l.info((String) listA.get(i));
		}*/
		
		
		//using Iterator#2
	/*	Iterator it =  listA.iterator();
        while (it.hasNext()) {
        	l.info((String) it.next());
        }*/
		
		//using new for loop 
		for (Object el : listA) {
			   l.info((String) el);
		}
	}

}
