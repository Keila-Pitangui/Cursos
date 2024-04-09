public class Car {
    //parâmetros
    private String marca;
    private String modelo;
    private int ano;
    private int preco;

    // Constructor
    Car(String marca, String modelo, int ano, int preco){
        // associando parâmetro a variáveis
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public double valorVenda(){
        double valorFinal = (preco * 0.1) + preco;
        return valorFinal;
    }
    // criando um getter
    // usando getter para ler informação privada
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }

    // criando um setter

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
