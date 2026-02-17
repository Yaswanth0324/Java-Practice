package exceptionhandling;

public class sample4 {
	public static void main(String[] args) {
		int a[] =new int[5];
		try{    
		      System.out.println(a[10]);  
		   }
		catch(ArithmeticException e)  
        {  
          System.out.println(e);  
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
           System.out.println(e);  
        }    
        catch(Exception e)  
        {  
         System.out.println(e);  
        }
		                           

	}

}
