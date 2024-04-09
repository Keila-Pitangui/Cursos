import java.util.Scanner;

public class Projeto3 {
    public static  void main (String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite uma valor abaixo: ");
        int numero = valor.nextInt();
        //String s = Integer.toString(numero);
//        if ( numero > 1 )
//            System.out.println("O número " + s + " possui " + s.length() + " um dígito.");
//        else (numero < )
//            System.out.println("O número " + s + " possui " + s.length() + " dígitos ou mais.");
        if (numero <9 && numero>=1) {
            System.out.println("Este número possui 1 dígito.");
        }
        else if (numero <100 && numero>=10 ) {
            System.out.println("Este número possui 2 dígito");
        }
    }
}