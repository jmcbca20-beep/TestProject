import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int  num1,num2,sum,mul,diff,pro;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number");
		num1=sc.nextInt();
		num2= sc.nextInt();
		System.out.println("Enter + for sum, - for diff, * for product and / for division");
		ch=sc.next().charAt(0);
		switch(ch) {
		case '+':
			sum=num1+num2;
			System.out.println("Sum is "+sum);
			break;
		case '-':
			diff=num1-num2;
			System.out.println("Difference is "+diff);
			break;
			default:
				System.out.println("The given character is not in list");
		}
		
	}

}
