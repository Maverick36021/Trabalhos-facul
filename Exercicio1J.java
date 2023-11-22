/*Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
pares situados na faixa numérica de 50 a 70.*/

package exerciciosManzano;

public class Exercicio1J {

	public static void main(String[] args) {
		int i=50,soma=0,media,cont=0;
		while(i<=70) {
			if(i%2==0) {
				soma=soma+i;
				cont++;
			}
				i++;
		}
		media=soma/cont;
		System.out.println("A soma dos valores corresponde a: "+soma);
		System.out.println("A media aritimética dos valores corresponde a: "+media);
	}

}
