package desafio01;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua categoria (1- Comum/-2 Associado/3- Vip): ");
        int categoria = sc.nextInt();
        System.out.println("Digite o valor da compra: ");
        float valorCompra = sc.nextFloat();
        float total;

        if(categoria == 1){
            System.out.println("Valor total da compra:  R$ " + valorCompra);
        }else if(categoria == 2){
            total = (valorCompra * 10) / 100;
            System.out.println("Valor da compra com desconto: R$ " + (valorCompra - total));
        }else if(categoria == 3){
            total = (valorCompra * 20) / 100;
            System.out.println("Valor da compra com desconto:  R$ " + (valorCompra - total));
        }else{
            System.out.println("Categoria não encontrada.");
        }
        sc.close();
    }
}
