package java1;

public class loops {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
//		int i=0;
//        while (i<6) {
//            System.out.println(i);
//            i++;
//            
//        }
//         int j=1;  // an infinitre Yash will be result
//        while(j==1){
//            System.out.println("yash");
//            
//        }
//		int k=4;
//        do { 
//            System.out.println(k);
//            k++;
//        } while (k<3);
//		int l=0;   //printd infinite 0 s
//        do { 
//            System.out.println(l);
//        } while (l<5); 
//		for(int i = 0;i<5;i++){
//            System.out.println(i);
//        }
//		int m= 1;       // prints infinite numbers >0
//        for (m=1;m>0;m++){
//            System.out.println(m);
//        }
//		for( i = 1;i<2;i++){
//            System.out.println(i);
//            for( k = 1;k<3;k++){
//                System.out.println(k);
//            }
//        }
//		String[] fruits={"apple","banana","cherry","grape"};
//        for(String a: fruits){
//            System.out.println(a);
//        }
		for(i=0;i<6;i++){
            System.out.println(i + ":" + java.lang.Math.pow(i,2));
        }
        for(i=0;i<5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        for(i=0;i<5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
	}
}
