package desafio01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();
        System.out.print("Digite mais um valor: ");
        int valor3 = sc.nextInt();

        if(valor1 + valor2 > valor3){
            System.out.print("É possível formar um triângulo");
        }else if(valor1 + valor3 > valor2){
            System.out.print("É possível formar um triângulo");
        }else if(valor2 + valor3 > valor1){
            System.out.print("É possível formar um triângulo");
        }
        sc.close();
    }
}
