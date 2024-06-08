package desafio01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();

        if(valor < 0){
            System.out.print("Valor negativo");
        }else if(valor == 0){
            System.out.print("Valor igual a 0");
        }else{
            System.out.print("Valor positivo");
        }
        sc.close();
    }
}
