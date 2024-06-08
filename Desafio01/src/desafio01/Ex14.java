package desafio01;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero >= 0){
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        }else{
            System.out.println("Valor ao quadrado: " + Math.pow(numero,2));
        }
        sc.close();
    }
}
