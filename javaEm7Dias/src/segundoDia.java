import java.util.Arrays;
// trabalhando com arrays com numero inteiros
public class segundoDia {
    public static void main (String[] args){
        int[] valores = {10, 20, 30, 40};
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length);
// Arrays com Strings
        String[] cars = {"BMW", "Tesla", "Jeep"};
        cars[2] = "Ferrari";
        System.out.println(Arrays.toString(cars));
        System.out.print(cars[2]);
// Arrays multidimensionais
        String[][] carros = {{"BMW", "Tesla"},{"Jeep", "Ferrari"}};
        System.out.println(Arrays.deepToString(carros));

// Variaveis constantes
       final double taxaJuros = 11.92;
        System.out.println(taxaJuros);
//        taxaJuros = 11.52;
        System.out.println(taxaJuros);
// Ordem dos operadores matemáticos
        int a = 6 + 2 * 2;
        int b = 6 + (2 * 2) - 3;
        System.out.println(a);
        System.out.println(b);
// Convertendo String em Integers + 2;
        String valorProduto = "10";
        int valorTotal = Integer.parseInt(valorProduto) + 2;
        System.out.println(valorProduto);
// Class Math
        double value = Math.round(10.2); // arredondar valores
        double value2 = Math.random() * 100;
        int value3 = (int)Math.round(Math.random() * 100);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
    }
}