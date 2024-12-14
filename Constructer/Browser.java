public class Browser {
    String Browsername;
    int size;
    String CurrentURL;
    double version;
    String status;
    Browser(){}
    public void waitting() throws InterruptedException
    {
        System.out.print("details processing");
        for(int i = 0; i<=5; i++)
        {
            Thread.sleep(900);
            System.out.print(" .");
        }
        System.out.println(); 
        System.out.println("Complete Data Is Downloaded");
        System.out.println();
        Thread.sleep(1600);     
    }
    Browser(String Brosername, int size, double version)
    {
        this.Browsername = Brosername;
        this.size = size;
        this.version = version;
        System.out.println("=====:Basic Details:=====");
        System.out.println("Browser Name :  "+Browsername);
        System.out.println("Browser Size : "+ size+"mb");
        System.out.println("Browser Status Is : Version");
    }
    
}
