package knightingale;

public class SwapNumbers {
	public static void main(String[] args) {
		float first=6.8f,second=9.8f;
		System.out.println("--before swap--");
		System.out.println("first number :" +first);
		System.out.println("second number :" +second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("--after swap--");
		System.out.println("first number :" +first);
		System.out.println("second number :" +second);
		
	}

}
