package arraylistexample;
import java.util.ArrayList;
public class clear {
	    public static void main(String[] args) 
	    {
	        ArrayList<String> arrayList = new ArrayList<>(); 
	         
	        arrayList.add("A");
	        arrayList.add("B");
	        arrayList.add("C");
	        arrayList.add("D");
	         
	        System.out.println(arrayList);   
	         
	        arrayList.clear();
	         
	        System.out.println(arrayList);   
	    }
	}
