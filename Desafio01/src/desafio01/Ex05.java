package desafio01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 =sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite a terceira nota: ");
        int nota3 = sc.nextInt();

        float media = (nota1 + nota2 + nota3) / 3f;
        if(media >= 7){
            System.out.print("Aprovado");
        }else if(media >= 5 && media < 7){
            System.out.print("Recuperação");
        }else{
            System.out.print("Reprovado");
        }
        sc.close();
    }
}
