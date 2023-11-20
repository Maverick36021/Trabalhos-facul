/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/


package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano em que estamos: ");
		int anoAtual = sc.nextInt();
		System.out.println("Agora informe o ano em que você nasceu");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual-anoNascimento;
		if(idade<16) {
			System.out.println("você tem "+idade+" anos de idade, e aida não pode votar!!!");
		}
		else
		{
			System.out.println("Você tem "+idade+" anos de idade, e ja pode votar !!!!");
		}
		sc.close();
	}

}
