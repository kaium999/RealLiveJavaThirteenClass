package controlflow;

public class Text2 {
	
	public static  boolean isEvenNumber(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		//Text2 ob1=new Text2();
		int n=5;
		int count=0;
		int total=0;
		
	
		int finish_number=20;
		while(n<=finish_number) {
			if(isEvenNumber(n)) {
				n++;
				continue;
				
			}
			System.out.println("odd number"+n);
			
			
			n++;
			count++;
			total+=n;
			if(count==5) {
			
				break;
			
			}
			
		
	
			
		}
		
		System.out.println(" The count is:"+count);
		System.out.println("The total is:"+total);
	
		
		
		/*int count=6;
		while(count!=0) {
			System.out.println("Count value is:"+count);
			count--;
		}
		*/
		/*
		for(int i=5;i!=01;i--) {
			System.out.println("Count value is :"+i);
		}
		*/
	}

}
