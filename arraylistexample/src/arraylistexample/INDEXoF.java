package arraylistexample;

import java.util.ArrayList;
import java.util.Arrays;

public class INDEXoF {
public static void main(String[] args)
{
	ArrayList<String> list=new ArrayList<>(Arrays.asList("sharon","anna","angelica"));
	int firstIndex =list.indexOf("sharon");
	System.out.println(firstIndex);
	firstIndex=list.indexOf("Good Morning");
	System.out.println(firstIndex);}
}
