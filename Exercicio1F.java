/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada 
 *a um expoente qualquer, ou seja, de B elevado a E, em que B é o valor da base e E o valor
do expoente.*/

package exerciciosManzano;
import java.lang.Math;
import java.util.Scanner;

public class Exercicio1F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp = "sim";
		double b,e,soma;
		while(resp.equals("sim" )|| resp.equals("SIM")) {
			System.out.println("Digite o valor da base: ");
			b=sc.nextDouble();
			System.out.println("Digite o valor do expoente: ");
			e=sc.nextDouble();
			soma=Math.pow(b, e);
			System.out.println(b+" Elevado a "+e+" = "+soma);
			System.out.println("Se deseja efetuar outra operação digite 'sim' ou digite qualquer tecla para encerrar !!!");
			resp=sc.next();
		}
		System.out.println("Fim do programa!!!");
		sc.close();

	}

}
