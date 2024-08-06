import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		//Dessa forma, ele lê em separação por espaço.
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Você digitou em x: " + x);
		System.out.println("Você digitou em y: " + y);
		System.out.println("Você digitou em z: " + z);
		
		sc.close();
	}

}
