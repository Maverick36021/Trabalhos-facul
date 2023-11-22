/*Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
usuário. */

package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1L {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num=0,menor=0,maior=0;
	 while(num>=0) {
		 System.out.println("Digite um valor inteiro: ");
		 num=sc.nextInt();
		 if(num>maior) {
			 maior=num;
		 }else if(num<menor) {
			 menor=num;
		 }
		 
	 }
	 System.out.println("O maior numero digitado foi: "+maior);
	 System.out.println("O menor numero digitado foi: "+menor);

	}

}
