class Rectangle
{
    int Width;
    int Lenth;
    public void setValue(int Width, int Lenth)
    {
        this.Width = Width;
        this.Lenth = Lenth;
    }
    public void getDetails()
    {
        System.out.println();
        System.out.println("Lenght Of Rectangle is : "+Lenth);
        System.out.println("Width Of Rectangle is : "+Width);
    }
    public void getArea()
    {
        int Result = 2*(Width+Lenth);
        System.out.println("Area Of Rectangle is : "+Result);
    }
}