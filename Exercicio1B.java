//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
package exerciciosManzano;

public class Exercicio1B {

	public static void main(String[] args) {
		int i =1, soma=0;
		while(i<=100) {
			soma=soma+i;
			i++;
		}
		System.out.println("A soma dos 100 primeiros numeros inteiros corresponde a: "+soma);
	}

}
