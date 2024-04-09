import java.util.*;

// crie 3 valores int, onde o usuário irá digitar 3 valores aleatórios e e você retorne os 3 valores na tela.
public class Desafio1 {
    public static void main(String[] args){
        Scanner value1 =  new Scanner(System.in);
        System.out.println("Digite um valor aleatório: ");
        int valor1 = value1.nextInt();
        Scanner value2 =  new Scanner(System.in);
        System.out.println("Digite outro valor aleatório: ");
        int valor2 = value2.nextInt();
        Scanner value3 =  new Scanner(System.in);
        System.out.println("Digite mais um valor aleatório: ");
        int valor3 = value3.nextInt();

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);



    }
}