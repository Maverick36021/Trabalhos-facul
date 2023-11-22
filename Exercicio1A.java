//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. 
package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =1;
		System.out.println("Digite o numero que deseja fazer a tabuada: ");
		int num = sc.nextInt();
		while(i<=10) {
			int res = num*i;
			System.out.println(num+" X "+i+" = "+res);
			i++;
			
		}sc.close();

	}

}
