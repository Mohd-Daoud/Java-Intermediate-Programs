class mainOverloading{
    public static void main(String obj){
        System.out.println("This a String Method");
    }
    public static void main(int a){
        System.out.println("This is int main method "+a);
    }
    public static void main(String[] args) {
        System.out.println("This Is Main Method");
        main(40); main(6.5); main("Mr_Malik"); main(50 ,"computer");
    }
    public static boolean main(int b, String c){
        System.out.println("This is boolean main method");
        return true;
    }
    public static void main(double c){
        System.out.println("This is float main method + "+c);
    }
}
