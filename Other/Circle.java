class Circle
{
    double Redias;
    public void setValue(double Redias)
    {
        this.Redias = Redias;
    }
    public void getDetails()
    {
        System.out.println();
        System.out.println("Becouse Of Redias of circle is : "+Redias);

    }
    public void getArea()
    {
        double Result = 3.145*Redias*Redias;
        System.out.println("Area Of Circle is : "+Result);
    }
}