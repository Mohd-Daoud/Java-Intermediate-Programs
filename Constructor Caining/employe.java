public class employe {
    String name;
    int id;
    double salary;
    String address;
    employe()
    {
        System.out.println("Normal Contructor : ");
        System.out.println();
    }
    employe(String name)
    {
        this();
        this.name = name;
        System.out.println("1 String rgument Constructor : ");
        System.out.println("Name 1 : "+name);
        System.out.println();
    }
    employe(String name , int id)
    {
        this("Malik");
        this.id = id;
        System.out.println("employe String int contructor : ");
        System.out.println("Name 2 : "+name +" Id : "+id+"");
        System.out.println();

    }
    employe(String name , int id, String address)
    {
        this("Joshi",201);
        //this.id = id;
        this.address = address;
        System.out.println("employe String int contructor : ");
        //System.out.println("Name : "+name+" Id "+id+ " Adress : "+address);
        System.out.println(" Adress : "+address);
        System.out.println();
    }
}
