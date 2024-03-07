package Day_2;
import java.util.*;
public class DecisionMaking_demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value: ");
		a=s.nextInt();
		System.out.println("Enter the value: ");
		b=s.nextInt();
		if(a>=b) {
			System.out.println("Condition: True");
		}
		else {
			System.out.println("Condition: False");
		}
		if((a<b)||(a==b)) {
			System.out.println("Condition is True");
		}else {
				System.out.println("Condition is False");
		}

	}

}
