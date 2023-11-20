/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados. */
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1º valor: ");
		double a = sc.nextDouble();
		System.out.println("Digite o 2º valor: ");
		double b = sc.nextDouble();
		System.out.println("Digite o 3º valor: ");
		double c = sc.nextDouble();
		if(a+b>c && a+c>b && c+b>a)
			System.out.println("Os valores digitados correspondem a um triângulo!! ");
		else
			System.out.println("Os valores digitados não correspodem a um triagulo!!");
		sc.close();
	}

}
