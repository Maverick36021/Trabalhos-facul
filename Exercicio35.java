/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
                 alcool
até 20 litros, desconto de 3% por litro Álcool
acima de 20 litros, desconto de 5% por litro
                gasolina
até 20 litros, desconto de 4% por litro Gasolina
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90. */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alcool = 2.90, gasolina = 3.30, valorTotal=0;
		System.out.println("Qual o tipo de combustivel ? ('A'Alcool e 'G'Gasolina)");
		String tipoCombustivel = sc.next();
		System.out.println("Digite a quantidade de litros de combustivel: ");
		double litros = sc.nextDouble();
		
		if(tipoCombustivel.equals("A") || tipoCombustivel.equals("a")) {
			if(litros<=20) {
				alcool = alcool-(alcool/100*3);
				valorTotal = litros*alcool;
			}
			else if(litros>20) {
				alcool = alcool-(alcool/100*5);
				valorTotal = litros*alcool;
			}
		}
		else if(tipoCombustivel.equals("G") || tipoCombustivel.equals("g")) {
			if(litros<=20) {
				gasolina = gasolina-(gasolina/100*4);
				valorTotal = litros*gasolina;
			}
			else if(litros>20) {
				gasolina = gasolina-(gasolina/100*6);
				valorTotal = litros*gasolina;
			}
		
		}
		System.out.printf("O valor total a ser pago é %.2f" ,valorTotal);
		sc.close();

	}

}
