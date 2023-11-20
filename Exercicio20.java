/* Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor qualquer: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite mais um valor qualquer: ");
		double valor2 = sc.nextDouble();
		if(valor1>valor2) {
			System.out.println(valor2+"\t" +valor1);
		}
		else {
			System.out.println(valor1+"\t"+valor2);
		}
		sc.close();

	}

}
