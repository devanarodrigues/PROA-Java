package desafio01;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if(numero < 100){
            System.out.println("O dobro do valor digitado é: " + (numero*2));
        }else{
            System.out.println("Valor maior que 100");
        }
        sc.close();
    }
}
