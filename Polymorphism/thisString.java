public class thisString {
    String name;
    int id;
    double salary;
    public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "Hello ";
    }
    public int hashCode() {
        return id;
    }
    public static void main(String[] args) {
        System.out.println("Main Method Static");
        System.out.println();
        thisString t1 = new thisString();
        System.out.println("toString result : "+t1.toString());
        System.out.println("equal result : "+t1.equals());
    }
    public boolean equals(Object o){
        thisString x = (thisString)o;
        return this.id == x.id && this.name.equals(x.name) && this.salary ==  x.salary;
    }
    
}
