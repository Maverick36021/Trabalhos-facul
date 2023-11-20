/*Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é:  n1*2 + n2*3 + n3*5 /10 */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o nome do aluno ?");
		String nome = sc.next();
		System.out.println("Digite a 1º nota de "+nome);
		double n1 = sc.nextDouble();
		n1 = n1*2;
		System.out.println("Agora digite a 2º nota");
		double n2 = sc.nextDouble();
		n2=n2*3;
		System.out.println("Agora digite a 3º nota");
		double n3 = sc.nextDouble();
		n3=n3*5;
		double mediaFinal = (n1+n2+n3)/10;
		System.out.println("A media final de "+nome+" é: "+mediaFinal);
		sc.close();
	}

}
