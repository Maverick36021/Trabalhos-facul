/* Uma fruteira está vendendo frutas com a seguinte tabela de preços:
      Até 5 Kg                 Acima de 5 Kg
  Morango R$ 2,50 por Kg   |||  R$ 2,20 por Kg
  Maçã R$ 1,80 por Kg      |||  R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. */

package ExercicioFaccat;
import java.util.Scanner;
public class Exercicio37{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double valorTotalMaca =0, valorTotalMorango=0,desconto=0;
        System.out.println("             Tabela de precos               ");
        System.out.println("Morangos: RS 2,50. Acima de 5Kg sai a RS 2,20 o Kg");
        System.out.println("Macas: RS 1,80. Acima de 5Kg sai a RS 1,50 o Kg");
        System.out.println("Quantos kg de morango deseja levar ?");
        double kgMorango = sc.nextDouble();
        System.out.println("E quantos Kg de maca deseja levar ?");
        double kgMaca = sc.nextDouble();
        if(kgMorango<=5){
            valorTotalMorango= kgMorango*2.50;
        }else{
            valorTotalMorango= kgMorango*2.20;
        }
        if(kgMaca<=5){
            valorTotalMaca= kgMaca*1.80;
        }else{
            valorTotalMaca= kgMaca*1.50;
        }
        double subTotal = valorTotalMaca+valorTotalMorango;
        if(kgMaca+kgMorango>8 || subTotal>25){
            desconto= subTotal/100*10;
        }else{
            desconto=0;
        }double valorTotalCompra=subTotal-desconto;
        System.out.printf("O valor final da compra é: %.2f",valorTotalCompra);
        sc.close();
    }
}