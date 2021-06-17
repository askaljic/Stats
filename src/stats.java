import java.util.Scanner;

public class stats {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double Sum, Mean, P, F, T, S, D, E, A, C;

		System.out.print("Enter five numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();

		Sum = a + b +c + d + e;
		System.out.printf("Sum: %.2f%n" ,Sum);

		Mean = Sum/5;
		System.out.printf("Mean: %.2f%n" ,Mean);

		P = (a - Mean);
		F = (b - Mean);
		T = (c - Mean);
		S = (d - Mean);
		D = (e - Mean);

		E = Math.pow (P, 2) + Math.pow (F , 2) + Math.pow (T, 2) + Math.pow (S, 2) + Math.pow (D, 2);

		A = E/5;

		C = Math.sqrt(A);

		System.out.printf("Population Standard Deviation: %.2f%n" , C);




	}

}