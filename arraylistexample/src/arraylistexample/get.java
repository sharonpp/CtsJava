package arraylistexample;
import java.util.ArrayList;
import java.util.Arrays;
 
public class get {

	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles", "dough"));
	         
	        String firstName = list.get(0);         //alex
	        String secondName = list.get(1);        //brian
	         
	        System.out.println(firstName);
	        System.out.println(secondName);
	    }
	}