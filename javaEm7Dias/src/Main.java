import java.util.Scanner; // package

// Package -> class -> methods -> statements
//package
// classe publica indica que outras partes do código podem acessa-lá
public class Main { //class
    public static void main(String[] args){ // methods
        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        byte idadeCliente = idadeScanner.nextByte();
        System.out.println(idadeCliente);
    //    byte minhaIdade = 28;
    //    int salarioMensal= 50_000; underscore serve para dividir o numero e facilitar sua leitura
    //    long idadeMilisegundos = 788400000000L; necessário L no final do número
    //    char initial= 'A';
    //    boolean eMaiorDeIdade = true;
    //    String fisrtName = "andre" + " Iacono"; strings possuem methods que podem ser acessados
    //    System.out.println(fisrtName.toUpperCase());
    //    System.out.println("Hello world!"); statements
    //    System.out.println(minhaIdade);
    //    System.out.println(idadeMilisegundos);
    //    System.out.println(initial);
    //    System.out.println(eMaiorDeIdade);
    //    System.out.println(salarioMensal);

    }
}

// tipos primitivos
// bytes, short, int, long, float, double, char, boolean