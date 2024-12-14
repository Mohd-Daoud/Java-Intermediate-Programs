public class School {
    String name;
    String address;
    int EstYear;
    int noOfStudent;
    String Pname;
    static int stCounter;
    School(String name2, String address )
    {
        this.name = name2;
        this.address = address;
        System.out.println();
        System.out.println("Basic details Of School");
        System.out.println("School name is : "+this.name);
        System.out.println("School address is : "+this.address);
    }
    School(String name, String address,  String Pname, int EstYear , int noOfStudent )
    {
        
        System.out.println("School name is : "+name);
        System.out.println("School address is : "+address);
        System.out.println("School Principal's name is : "+Pname);
        System.out.println("School Established year is : "+EstYear);
        System.out.println("School No Of Student is : "+noOfStudent);
    }
    School(){}
    public void studentCounter()
    {
        stCounter = stCounter+noOfStudent;
        System.out.println("No Of Student Persent In College : "+stCounter);
        
    }

}
