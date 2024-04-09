public class Projeto4{
    public static void main(String[] args){
        // Desafio A
        for (int i = 0; i <= 100; i++)
            if (i % 2 == 0)
            System.out.print(i + " ");
        // Desafio B
        String s = "Hello World!";
        System.out.println(s.replaceAll("(.)", "$1 "));

        String spaces = "Hello World!";
        for(int i = 0; i <= spaces.length() - 1; i++)
            System.out.print(spaces.charAt(i) + " ");

    }
}
