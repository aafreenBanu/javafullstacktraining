package knightingale;
import java.util.Scanner;
public class WhileloopDemo {
	public static void main(String[] args) {
		int number, sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("n please enter any integer below 10:");
		number=scan.nextInt();
		while(number<=10) {
			sum=sum+number;
			number++;
			
		}
		System.out.format("Sum of the numbers from while loop is:%d",+sum);
		
		
	}

}
