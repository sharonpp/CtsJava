package exceptionjavat;

public class exceptionpropagation {
void m()
{
	int data=60/0;
	}
void y()
{m();
}
void f()
{
	try{
		y();
	}

	catch(Exception e)
	{
		System.out.println("Exception handled");}
	}
	public static void main(String [] args)
	{
		exceptionpropagation sp=new exceptionpropagation();
		sp.f();
	System.out.println("normal flow");
	}
}