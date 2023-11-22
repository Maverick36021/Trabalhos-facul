//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
package exerciciosManzano;

public class Exercicio1C {

	public static void main(String[] args) {
		int i=1,soma=0;
		while(i<=500) {
			if(i%2==0) {
				soma=soma+i;
			}
			i++;
		}
		System.out.println("A soma dos valores pares de 1 a 500 corresponde a: "+soma);

	}

}
