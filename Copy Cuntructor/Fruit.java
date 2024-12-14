class Fruit
{
    String name;
    int price;
    double waight;
    Fruit(String name, int price, double waight)
    {
        this.name = name;
        this.price = price;
        this.waight = waight;
        System.out.println("I Am Peramitrize Constructer ");
    }
    Fruit(Fruit k)
    {
        this.name = k.name;
        this.price = k.price;
        this.waight = k.waight;
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Waight : "+waight);
    }
    
}