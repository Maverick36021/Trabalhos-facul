/*Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
novo com a mulher mais velha*/
package ExercicioFaccat;
import java.util.Scanner;
public class Exercicio36
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idadeHomemVelho =0,idadeHomemNovo=0,idadeMulhervelha=0,idadeMulherNova=0;
		System.out.println("Obs: informe idades diferentes: ");
		System.out.println("Informe a idade do 1º homem: ");
		int idadeHomem1 = sc.nextInt();
		System.out.println("Informe a idade do 2º homem: ");
		int idadeHomem2 = sc.nextInt();
		System.out.println("Agora informe a idade da 1º mulher: ");
		int idadeMulher1 = sc.nextInt();
		System.out.println("E agora digite a idade da 2º mulher: ");
		int idadeMulher2 = sc. nextInt();
		if(idadeHomem1>idadeHomem2){
		    idadeHomemVelho = idadeHomem1;
		}else{
		    idadeHomemVelho = idadeHomem2;
		}
		if(idadeMulher1>idadeMulher2){
		    idadeMulhervelha = idadeMulher1;
		}else{
		    idadeMulhervelha = idadeMulher2;
		}
		System.out.println("A soma das idades do homem mais velho e da mulher mais nova, corresponde a: "+idadeHomemVelho+idadeMulherNova);
		System.out.println("O produto das idades do homem mais novo com a idade da mulher mais velha, corresponde a: "+idadeHomemNovo*idadeMulhervelha);
	    sc.close();
	}
}
