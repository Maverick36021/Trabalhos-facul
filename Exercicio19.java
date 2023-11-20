/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer: ");
		double valor1 = sc.nextDouble();
		System.out.println("Informe mais um valor qualquer: ");
		double valor2 = sc.nextDouble();
		if(valor1>valor2) {
			System.out.println(valor1+" é maior do que "+valor2);
		}
		else {
			System.out.println(valor2+" é maior do que "+valor1);
		}
		sc.close();

	}

}
