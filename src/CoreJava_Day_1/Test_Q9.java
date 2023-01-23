package CoreJava_Day_1;

public class Test_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		System.out.println("length: "+A.length);
		//a15 sum
		A[15]=A[0]+A[14];
		//a16 average
		for(int i=0;i<16;i++) {
			A[16]+=A[i];
		}
		A[16]=(int)(A[16]/15);
		//a17 smallest
		A[17]=A[0];
		for(int i=0;i<17;i++) {
			if(A[17]>A[i]) {
				A[17]=A[i];
			}
		}
		//show
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
	}

}
