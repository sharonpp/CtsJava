package arraylistexample;
import java.util.ArrayList;
public class clone {
	
	 
	    public static void main(String[] args) 
	    {
	        ArrayList<String> arrayListObject = new ArrayList<>(); 
	         
	        arrayListObject.add("z");
	        arrayListObject.add("z");
	        arrayListObject.add("z");
	        arrayListObject.add("z");
	         
	        System.out.println(arrayListObject);   
	         
	        ArrayList<String> arrayListClone =  (ArrayList<String>) arrayListObject.clone();
	         
	        System.out.println(arrayListClone);   
	    }
	
}
