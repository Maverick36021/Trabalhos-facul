/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos.*/

package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		double soma=0,num,media;
		while(i<=10) {
			System.out.println("Digite o "+i+"º valor: ");
			num=sc.nextDouble();
			soma=soma+num;
			i++;
		}
		media=soma/10;
		System.out.println("A soma dos valores apresentados corresponde a: "+soma);
		System.out.printf("A media aritimética dos valores apresentados corresponde a: %.2f",media);

	}

}
