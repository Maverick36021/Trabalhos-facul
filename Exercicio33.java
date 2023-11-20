/*Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro. */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1º valor: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o 2º valor: ");
		double valor2 = sc.nextDouble();
		if(valor1>valor2) {
			System.out.println("O primeiro é maior !!");
		}
		else if(valor1<valor2) {
			System.out.println("O segundo é maior !!");
		}
		else {
			System.out.println("Numeros iguais !!!");
		}
		sc.close();

	}

}
