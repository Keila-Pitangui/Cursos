import java.util.Scanner;

public class Projeto {
    public static void main(String[] args){
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = numero1.nextDouble();
        System.out.print("Digite outro valor: ");
        double valor2 = numero2.nextDouble();
        double resultado = valor1 + valor2;

        //System.out.println(valor1 + " + " + valor2 + " é igual a: " + resultado);
        //System.out.println(valor1 + valor2);
        System.out.println("O resultado é: " + resultado);
    }
}