package knightingale;

public class Largestnumber {
	public static void main(String[] args) {
		double n1=10.5,n2=15.5,n3=13.5;
		if(n1>n2 && n1>n3)
			System.out.println(n1 + "  is the largest number");
		else if(n2>n3 && n2>n1)
		    System.out.println(n2 + " is the largest number");
		else
			System.out.println(n3 + " is the largest number");
	}

}
