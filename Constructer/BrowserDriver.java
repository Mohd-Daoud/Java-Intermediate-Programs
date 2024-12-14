public class BrowserDriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        System.out.println("Now Browser Status Is : Online");
        Browser b1 = new Browser();
        b1.waitting();
        Browser b2 = new Browser("Search Engine",29,1.72);
        System.out.println("Now Browser Status Is : Ofline");
        System.out.println();
    }
    
}
