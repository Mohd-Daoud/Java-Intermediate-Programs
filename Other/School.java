public class School {
    String name ;
    String Address;
    String Course;
    int SchooNo;
    int ContactNo;
    
    public void setDetails(String name , String Address , String Course , int  SchoolNo , int ContactNo)
    {
        System.out.println();
        this.name = name;
        this.Address = Address;
        this.Course = Course;
        this.SchooNo = SchoolNo;
        this.ContactNo = ContactNo;
    }
    public void getDetails()
    {
        System.out.println();
        System.out.println("Name Of Your School Is : "+name);
        System.out.println("Address Of Your School Is : "+Address);
        System.out.println("Course Of Your School Is : "+Course);
        System.out.println("School No Of Your School Is : "+SchooNo);
        System.out.println("ContactNo Of Your School Is : "+ContactNo);
    }
}
