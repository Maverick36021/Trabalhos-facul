// Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		System.out.println("O antecessor de "+valor+" é: "+(valor-1));
		sc.close();

	}

}
