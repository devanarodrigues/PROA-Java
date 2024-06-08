package desafio01;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        float altura = sc.nextFloat();
        System.out.print("Digite seu peso: ");
        int peso = sc.nextInt();
        float imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc < 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc < 34.9){
            System.out.println("Obesidade grau I");
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau II");
        }else if(imc > 40){
            System.out.println("Obesidade grau III");
        }
        sc.close();
    }
}
