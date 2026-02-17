package exceptionhandling;

public class sample3 {
	public static void main(String[] args) {
		int a[]=new int[5];
		try {
			a[10]=30/0;
			System.out.println(a[11]);
		}
		   
        catch(ArrayIndexOutOfBoundsException e)  
		{  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
         }
		catch(ArithmeticException e)  
		{  
              System.out.println("Arithmetic Exception occurs");                   
        } 
		catch(Exception e){
			System.out.println(e);
		}

		
	}

}
