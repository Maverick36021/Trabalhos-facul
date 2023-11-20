/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da conta do cliente: ");
		String numeroConta = sc.next();
		System.out.println("Agora informe o saldo da conta: ");
		double saldo = sc.nextDouble();
		System.out.println("Digite o valor de debitos na conta: ");
		double debitos = sc.nextDouble();
		System.out.println("E agora informe o limite de credito da conta: ");
		double limiteCredito = sc.nextDouble();
		double saldoAtual = saldo+limiteCredito-debitos;
		if(saldoAtual>=0) {
			System.out.printf("O saldo da conta: "+numeroConta+" é positivo. \n"+"Saldo: R$ %.2f ", saldoAtual);
		}
		else {
			System.out.printf("O saldo da conta: "+numeroConta+" é negativo. \n"+"Saldo: R$ %.2f ", saldoAtual);
		}
		sc.close();
	}

}
