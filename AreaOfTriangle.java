package knightingale;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String args[]) { 
		 Scanner scanner = new Scanner(System.in); 
		 System.out.println("Enter the width of the Triangle:"); 
		 double width = scanner.nextDouble(); 
		 System.out.println("Enter the height of the Triangle:"); 
		 double height = scanner.nextDouble(); 
	
		double area = (width* height)/2; 
		 System.out.println("Area of Triangle is: " + area); 
		 }

}
