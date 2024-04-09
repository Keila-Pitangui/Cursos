public class Sextodia {
    public static void main(String[] args){

        Clients c001 = new Clients();
        c001.firstName = "André";
        c001.age = 29;

        Clients c002 = new Clients();
        c002.firstName = "Mariana";
        c002.age = 29;

        System.out.println(c002.firstName);

        c002.newAccount();
    }
}