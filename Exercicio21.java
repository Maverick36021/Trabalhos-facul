/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.*/
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 24, duracao =0;
		System.out.println("Digite a hora de inicio do jogo: ");
		int horaInicio = sc.nextInt();
		System.out.println("Digite a hora de termino do jogo: ");
		int horaTermino = sc.nextInt();
		duracao = dia-horaInicio+horaTermino;
		if(duracao<24)
			System.out.println("O tempo de duração da partida foi de "+(duracao)+" Horas");
		else
			System.out.println("O tempo de duração da partida foi de "+(duracao-24)+" Horas");
		sc.close();

	}

}
