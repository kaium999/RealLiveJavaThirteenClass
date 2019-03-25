package controlflow;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		//int value;
		Scanner reader=new Scanner(System.in);
		System.out.print("Please Enter Your Number:");
		String value=reader.nextLine();
		/*if(value==2) {
			System.out.println("The value is 2");
		}
		else if(value==3) {
			System.out.println("The value is 3");
		}
		else {
			System.out.println("The value is not Found");
		}
		*/
		switch(value) {
		case "Kaium":System.out.println("The name is:"+value);
		break;
		case "Pranto":System.out.println("The name is:"+value);
		break;
		case "Siam":System.out.println("The name is:"+value);
		break;
		case "Nishat":System.out.println("The name is:"+value);
		break;
		default:System.out.println("The value is not found");
		break;
		}
		
		
		
		

	}

}
