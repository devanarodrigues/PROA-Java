package desafio01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        System.out.println("Escolha a operação (soma = 1,subtracao = 2,divisao = 3,multiplicacao = 4): ");
        int operacao = sc.nextInt();
        System.out.println(operacao);

        if (operacao == 1) {
            System.out.print(num1 + " + " +  num2  + " = " + (num1 + num2));
        } else if (operacao == 2) {
            System.out.print(num1 + " _ " +  num2 + " = " + (num1 - num2));
        } else if (operacao == 4) {
            System.out.print(num1 + " * " +  num2 + " = " + (num1 * num2));
        } else if (operacao == 3) {
            System.out.print(num1 + " / " +  num2 + " = " + (num1 / num2));
        } else {
            System.out.print("Escolha uma operação válida");
        }
        sc.close();
    }
}
