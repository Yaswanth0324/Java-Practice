package java1;
import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		int x =2;
        int y =10;
        if (x>y){
            System.out.println("x is greaterthan y");
        }else{
            System.out.println("x is lessthan y");
        }
	
        int time =23;
        if (time<12){
            System.out.println("good morning");
        }else if (time<15){
        
            System.out.println("good afternoon");
        }else if (time<21){
            System.out.println("good evening");
        }else{
            System.out.println("good night");
        }
		 	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number (1 to 7) to get the day of the week:");
		int day =sc.nextInt();
        switch(day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
                
            case 7:
                System.out.println("saturday");
                break;

        }
	}

}
