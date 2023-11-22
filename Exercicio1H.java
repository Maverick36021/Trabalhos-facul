/*Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
é F=9C+160)/5 , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */
package exerciciosManzano;
public class Exercicio1H {

	public static void main(String[] args) {
		int i =10;
		while(i<=100) {
		double temperaturaFahrenheit = (i*9+160)/5;
		System.out.println(i+"ºC é igual a "+temperaturaFahrenheit+"F");
		i+=10;
                     }
}

    }
