/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
 Considerar ano com 365 dias e mês com 30 dias.*/
package ExercicioFaccat;

import java.util.Scanner;

public class Exercico7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o seu nome : ");
		String nome = sc.next();
		System.out.println("Certo "+nome+" Agora Digite a sua idade somente em Anos");
		int ano = sc.nextInt();
		System.out.println("Ok, e quantos meses? ");
		int mes = sc.nextInt();
		System.out.println("E quantos dias? ");
		int dias = sc.nextInt();
		int anos = ano*365;
		int meses = mes*30;
		int idade = (anos+meses)+dias;
		if(idade== 1)
		System.out.println("Você possui "+idade+" Dia de vida!!!");
		else
		System.out.println("Você possui "+idade+" Dias de vida!!!");
		sc.close();
		
	}

}
