// Criar um programa que teste as seguintes variações:
// input = N
// N é igual a um número impar = impar
// N é par e esta entre 2 e 5 e pertence ao grupo A
// N é par e esta entre 6 e 20 e pertence ao grupo B
// N é par e esta acima de 20 e pertence ao grupo C

import java.util.*;

public class Desafio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 1){
            System.out.println(n + " é um número impar.");
        } else if ( n > 1 && n < 5 && (n % 2 == 0)){
            System.out.println( n + " é par e esta entre 2 e 5 e pertence ao grupo A.");
        } else if (n > 6 && n < 20 && (n % 2 == 0)){
            System.out.println( n + " é par e esta entre 6 e 20 e pertence ao grupo B.");
        } else if (n > 20 && (n % 2 == 0)){
            System.out.println(n + "é par e esta acima de 20 e pertence ao grupo C");
        } else {
            System.out.println("Atenção! Digite um valor válido.");
        }
    }
}