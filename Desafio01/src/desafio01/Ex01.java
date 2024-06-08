package desafio01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();
        if(valor % 2 == 0){
            System.out.print("Número par");
        }else{
            System.out.print("Número impar");
        }
        sc.close();
    }
}
