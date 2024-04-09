// interligado com a class Car
public class Main6 {
    public static void main(String[] args){

    Car car = new Car("BMW", "X6", 2024, 125_000);

    // car.modelo = "X5" ; usando setter para alterar parãmetro
        car.setModelo("X5");

        //System.out.println(car.marca); parâmetro privado
        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("O valor da venda é: " + car.valorVenda());
    }
}