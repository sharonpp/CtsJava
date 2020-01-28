package arraylistexample;
import java.util.ArrayList;
public class addinbetween {

	 

	    public static void main(String[] args) 
	    {
	        ArrayList<String> list1 = new ArrayList<>();    //list 1
	         
	        list1.add("m");
	        list1.add("k");
	        list1.add("e");
	        list1.add("y"); 
	        ArrayList<String> list2 = new ArrayList<>();    //list 2
	         
	        list2.add("o"); 
	        list2.add("n"); 
	         
	        list1.addAll(1, list2); //Elements will be inserted from index 2 
	         
	        System.out.println(list1);      //combined list
	    }
	}
