public class CounterClearException extends Exception {
    
	String s1;
	CounterClearException(String a) 
	{
		super(a);
		s1=a;		
	}
}