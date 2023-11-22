/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio*/

package exerciciosManzano;
import java.lang.Math;
public class Exercicio1E{

	public static void main(String[] args) {
		int i=0;
		double soma=0;
		while(i<=15) {
			soma= Math.pow(3, i);
			System.out.println(soma);
			i++;
		}

	}

}
