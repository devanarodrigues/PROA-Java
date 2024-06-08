package desafio01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();
        if( nota >= 9){
            System.out.print("A");
        }else if( nota < 9 && nota >= 7){
            System.out.print("B");
        }else if( nota < 7 && nota >= 5){
            System.out.print("C");
        }else if( nota < 5 && nota >= 3){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
        sc.close();
    }
}
