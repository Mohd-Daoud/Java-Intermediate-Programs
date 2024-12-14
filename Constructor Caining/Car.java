public class Car {
    String name;
    int id;
    Car()
    {
        System.out.println("Car No-agrs constructor ");
    }
    Car(String name)
    {
        this();
        
        System.out.println("Name : "+name);
        System.out.println("Car String Agrs Contructor ");
    }
    Car(int id)
    {
        this("Malik");
        System.out.println();
        System.out.println("Car int agrs Constructor ");
    }
    
}