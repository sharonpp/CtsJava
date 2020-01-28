package arraylistexample;
import java.util.ArrayList;
public class addall {
	
	 
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list1 = new ArrayList<>();    //list 1
	         
	        list1.add("Alpha");
	        list1.add("Beta");
	        list1.add("Charlie");
	        list1.add("Delta");
	         
	        ArrayList<String> list2 = new ArrayList<>();    //list 2
	         
	        list2.add("Elephant");
	         
	        list1.addAll(list2);
	         
	        System.out.println(list1);   
	    }
}
