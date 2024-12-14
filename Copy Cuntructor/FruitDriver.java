public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 =  new Fruit("Mango", 200, 2.5 );
        System.out.println();
        System.out.println("=========:Copy Cuntructer:=========");
        Fruit k = new Fruit(f1);
    }
}
