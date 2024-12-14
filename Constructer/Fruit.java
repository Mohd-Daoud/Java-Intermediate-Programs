class Fruit
{
    int id;
    String name;
    Fruit()
    {
        System.out.println("This is Fruit Costructer");
    }
    public void test()
    {
        System.out.println("This Fruit Class Test Mathod");
    }
    Fruit(int a , double b , String name)
    {
        this.name = name;
        System.out.println("Sum : "+(a+b) +" and Name : "+name);
    }
    public static void demo()
    {
        System.out.println("This is demo static mathod");
    }
    int RollNo;
}