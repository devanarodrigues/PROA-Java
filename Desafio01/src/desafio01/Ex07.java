package desafio01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade <= 12 && idade > 0) {
            System.out.print("Criança");
        } else if (idade > 12 && idade <= 17) {
            System.out.print("Adolescente");
        }else if (idade > 17 && idade <= 59) {
            System.out.print("Adulto");
        }else if (idade >= 60) {
            System.out.print("Idoso");
        }

        sc.close();
    }
}
