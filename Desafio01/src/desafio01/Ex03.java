package desafio01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int valor2 = sc.nextInt();

        if(valor1 > valor2){
            System.out.println("Maior: " + valor1);
            System.out.println("Menor: " + valor2);
        }else{
            System.out.println("Maior: " + valor2);
            System.out.println("Menor: " + valor1);
        }
        sc.close();
    }
}

