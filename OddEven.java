package knightingale;
import java.util.Scanner;
class OddEven{
	public static void main(String[] args) {
		int num;
		System.out.println("enter a number:");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
			System.out.println("its a even number");
		else
		System.out.println("its an odd number");
			
		
	}
	
}