package Multithreading;

class student implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Students " + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());

	}
	
}
public class testThread1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//default threads before we creating multiple threads
//		System.out.println("java programmer");
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());

//        Thread t1=new Thread();          //thread creation using object or instance
//        t1.start();
//        System.out.println(Thread.activeCount());
          student s=new student();
          //Thread t4=new Thread(s);    //this will execute eith same thread name 
          Thread t4=new Thread(s,"t4");   //we can change thread name easily using this 
          t4.start();
        
        
//        student t2 =new student("t1");    //change the thread name using constructor
//        t2.start();    
//        teacher t3=new teacher();    // running the thread using extend
//        t3.start();

	}

}
//class student extends Thread{
//	public student(String Tname){
//		super(Tname);
//		
//	}
//	@Override
//	public void run() {               //to see the thread name and id use this commands
//		System.out.println("Students " + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
//
//	}
//}
//class teacher extends Thread{
//	@Override
//	public void run() {           //to see the thread name and id use this commands
//		System.out.println("teachers " + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
//
//	}
//}