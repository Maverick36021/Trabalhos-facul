// Ler um valor e escrever se é positivo, negativo ou zero.

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		if(valor>0) {
			System.out.println("O numero "+ valor+" é positivo !!!");
		}
		else if(valor<0) {
			System.out.println("O numero "+valor+ " é negativo !!!");
		}
		else {
			System.out.println("O numero "+valor+" é zero !!! ");
		}
		sc.close();

	}

}
