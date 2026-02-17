package Multithreading;

public class synchronized_test {

	public static void main(String[] args) throws InterruptedException {
		bricksCount bc=new bricksCount();
		Runnable r1 = () -> {
			for(int i=0;i<3000;i+=50) {
				bc.incrementBrickCount();
;			}
			
		};
		Runnable r2 = () -> {
			for(int i=0;i<2000;i+=50) {
				bc.incrementBrickCount();
			}
			
		};
		Runnable r3 = () -> {
			for(int i=0;i<1000;i+=50) {
				bc.incrementBrickCount();
			}
			
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
//		t1.sleep(10);
		t2.start();
//		t2.sleep(10);
		t3.start();
		t3.sleep(100);
		System.out.println(bc.brickCount);
		System.out.println(bc.brickCount1);


	}

}
class bricksCount{
	int brickCount=0;
	int brickCount1=0;
	public  void incrementBrickCount() {
		synchronized(this) {
			brickCount +=50;
			brickCount1 +=50;
		}
		
	}
}
