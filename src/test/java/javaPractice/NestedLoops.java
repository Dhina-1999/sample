package javaPractice;

public class NestedLoops {
	
	public static void main(String[] args) {
		int k;
		/*for(int i=1;i<7;i++) {
			//System.out.println("OuterLoop of iteration"+ i);
			
			for(int j=1;j<=7-i;j++) {
				k=j;
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println("\t");
		}*/
		for(int i=1;i<7;i++) {
			//System.out.println("OuterLoop of iteration"+ i);
			
			for(int j=1;j<=i;j++) {
				k=j;
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println("\t");
		}
	}

}
