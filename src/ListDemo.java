import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListDemo {

	public ListDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List arrayList = new ArrayList();
		
		for(int i =0; i< 100; i++) {
			arrayList.add(i);
		}
		for(int i =0; i< 100; i++) {
			System.out.println("List item is " + arrayList.get(i));
		}
		
		Map hashMap= new HashMap();
		for(int i =0; i< 100; i++) {
			hashMap.put("key-"+i, i);
		}
		
		for(int i =0; i< 100; i++) {
			System.out.println("Map item with key "+ ("key-"+i) + " is " + hashMap.get("key-"+i));
		}
		
		System.out.println(hashMap.get("key-20"));

	}

}
