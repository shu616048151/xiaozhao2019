package speech.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListTest {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("adfsd");
		list.add("2353");
		list.add("sdfgsd");
		list.add("gasdg");
		
		/*Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
		for (String sdf : list) {
			System.out.println(sdf);
		}
		
		
		
	}

}
