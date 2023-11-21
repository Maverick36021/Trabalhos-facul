/* Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
a pagar (total a pagar = total - desconto), sabendo-se que:
 - Se quantidade <= 5 o desconto será de 2%
 - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 - Se quantidade > 10 o desconto será de 5%*/
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double subTotal=0, desconto=0;
		System.out.println("Informe o nome do produto: ");
		String nomeDoProduto = sc.nextLine();
		System.out.println("E quantos "+nomeDoProduto+" você deseja levar ?");
		int quantidade = sc.nextInt();
		System.out.println("Qual o valor do produto ?");
		double valorProduto = sc.nextDouble();
		subTotal = quantidade*valorProduto;
		if(quantidade<=5) {
			desconto=valorProduto/100*2;
		}else if(quantidade>5 && quantidade<=10) {
			desconto=subTotal/100*3;
		}else if(quantidade>10) {
			desconto= subTotal/100*5;
		}
		double valorTotal = subTotal-desconto;
		
		System.out.printf("O valor total da compra de "+quantidade+" "+nomeDoProduto+" com desconto de R$"+desconto +" é R$%.2f",valorTotal);
        sc.close();
	}

}
