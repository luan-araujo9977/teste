package teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int result = 0;
		int mult;
		int x = sc.nextInt();
		
		while (result != x && result < x) {
			mult = i * i;
			i++;
			result = mult;
		}
		if (result > x) {
			System.out.println("Raiz não exata");
		}
		else {
			System.out.println(i-1);
		}
		
		sc.close();
	}

}
