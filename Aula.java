package cursoJava;

import java.util.Scanner;

public class Aula18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tab = 0;
		System.out.println("Insira o numero que deseja ver a tabuada.");
		int num = entrada.nextInt();
		for(int i =1; i < 11; i++) {
			tab = i * num;
			System.out.printf("%d x %d = %d\n", num, i);
		}
			
		entrada.close();
	}

}
