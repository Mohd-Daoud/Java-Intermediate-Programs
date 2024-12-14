final class Printer {
    private final String model;
    private final int price;
    private final String type;

    Printer (String model, int price, String type)
    {
        this.model = model;
        this.price = price;
        this.type = type;
    }
    public String getModel(){

        return model;
    }
    public int getPrice()
    {
        return price;
    }
    public String geString()
    {
        return type;
    }
    public static void main(String[] args) {
        Printer p1 = new Printer("HP109", 23993297, "Automatic");
        System.out.println("model : "+p1.model+" price : "+p1.price+" type "+p1.type);
    }

}