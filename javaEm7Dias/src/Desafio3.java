// Crie uma calculadora

import java.util.*;

public class Desafio3 {
    public static void main(String[] args){
        Scanner operacao = new Scanner(System.in);
        System.out.println("Escolha a operação desejada: \n 1. Soma \n 2. Subtração \n 3. Multiplicação \n 4. Divisão \n");
        int escolha = operacao.nextInt();

        Scanner n1 = new Scanner(System.in);
        System.out.println("\n Agora, digite o primeiro número: ");
        double value1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        double value2 = n2.nextInt();

        if( escolha == 1){
            System.out.println(value1 + value2);
        } else if(escolha == 2){
            System.out.println(value1 - value2);
        }
        else if(escolha == 3){
            System.out.println(value1 * value2);
        } else if(escolha == 4){
            System.out.println(value1 / value2);
        }else{
            System.out.println("Opção inválida! Tente novamente.");
        }
    }
}