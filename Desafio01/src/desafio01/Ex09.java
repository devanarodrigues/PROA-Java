package desafio01;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código: ");
        int codigo = sc.nextInt();

        if( codigo >= 1 && codigo <= 10){
            System.out.print("Alimento não-perecível");
        }else if( codigo > 10 && codigo <= 20){
            System.out.print(" Alimento perecível");
        }else if( codigo > 20 && codigo <= 30){
            System.out.print("Vestuário");
        }else if( codigo > 30 && codigo <= 40){
            System.out.print("Eletrônicos");
        }else{
            System.out.print("Código inválido");
        }
        sc.close();
    }
}
