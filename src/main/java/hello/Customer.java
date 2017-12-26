package main.java.hello;

public class Customer {
	

	public void main(String[] args) {
	 int mresult = 0;
	int PI = 314;
	int[] number = {234, 451};
	for(int n=0; n<2; n++ ) {
		
		int check_nb = number[n];
		
		int result = (check_nb - PI);
		
		result += result;
		
		mresult = result;
	}
	
	System.out.println(mresult);

}
}
