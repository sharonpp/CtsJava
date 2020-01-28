package arraylistexample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
 
public class foreach {
	

	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	       ArrayList<String> names = new ArrayList<>(Arrays.asList("SHARON","ANNA","ANGELICA","DANIEL")); 
	        
	       //1 
	       names.forEach(name -> System.out.println(name.toLowerCase()));
	 
	       //2
	       Consumer<String> lambdaExpression = x -> System.out.println(x.toLowerCase());
	 
	       names.forEach(lambdaExpression);
	    }
	}
