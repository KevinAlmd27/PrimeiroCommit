Boa noite, bora estudar?
package cursoJava;

import java.util.Random;
import java.util.Scanner;

public class Aula18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt();
		boolean acertou = false;
		int tentativa;
		do{
			System.out.println("Adivinhe o numero");
			tentativa = entrada.nextInt();
			
		if(tentativa < 1 || tentativa > 10) {
			System.out.println("Numero Invalido");
		}
		else if(tentativa  > numeroAleatorio) {
			System.out.println("Passou Longe.");
		}
		else if(tentativa < numeroAleatorio) {
			System.out.println("Muito baixo");
		}
		else {
			System.out.println("Numero Certo "+numeroAleatorio);
			acertou = true;
		}
		}while(!false);
		
		
	}
	
}
