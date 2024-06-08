package desafio01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)){
            System.out.print("Ano bissexto");
        }else{
            System.out.print("Ano não bissexto");
        }
        sc.close();
    }
}
