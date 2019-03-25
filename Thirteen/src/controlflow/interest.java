package controlflow;

public class interest {
	public static double claculateInterest(double amount,double interestRate) {
		return (amount*(interestRate/100));
	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		//for(int i=2; i<=n/2;i++) 
		for(int i=2; i<=Math.sqrt(n);i++){
			System.out.println("Loop is iterating "+i+"times!");
			if(n%i==0) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
	  interest ob1=new interest();
	  int count=0;
	  //ob1.isPrime(10);
	  for(int i=2;i<9;i++) {
	 // double total=ob1.claculateInterest(10000.00, i);
	  //System.out.println("The total interest is:"+total);
	  System.out.println("The 2% interest amount of 10000: is:"+String.format("%.2f", ob1.claculateInterest(10000.0, i)));
	  for (int j=10;j<50;j++) {
		  if(isPrime(i)) {
			  count++;
			  System.out.println("(Non optimised)"+"The Number "+i+" is a prime number");
			  if(count==10) {
				  System.out.println("Exitng for loop");
				  break;
			  }
		  }
	  }
	  }
	}

}
