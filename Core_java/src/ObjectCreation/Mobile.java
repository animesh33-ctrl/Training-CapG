package ObjectCreation;


 public class Mobile {
    String model;
    int battery;

    void usePhone() {
        battery -= 10;
        System.out.println(model + " battery now: " + battery + "%");
    }



    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.model = "Samsung";
        m1.battery = 80;
        m1.usePhone();
    }
}
