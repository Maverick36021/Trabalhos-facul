//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. 
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insira as dimenções do retângulo");
	System.out.println("Valor da base: ");
	float base = sc.nextFloat();
	System.out.println("E agora o valor da altura: ");
	float altura = sc.nextFloat();
	System.out.println("A àrea deste retângulo è: "+base*altura+" m²");
	sc.close();

   }
}
