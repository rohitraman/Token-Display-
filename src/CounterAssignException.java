public class CounterAssignException extends Exception {
    
	String s1;
	CounterAssignException(String a) 
	{
		super(a);
		s1=a;		
	}
}
