/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).!*/
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		if(valor >=0)
		    System.out.println("O numero "+valor+" E positivo");
		else
		    System.out.println("O numero "+valor+" e negativo");
		sc.close();
	}
}
