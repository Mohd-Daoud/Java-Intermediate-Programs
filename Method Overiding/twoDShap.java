class twoDShap
{
    public void getArea()
    {
        System.out.println("Area Of 2Dshape ");
    }
}
class Circle extends twoDShap
{
    //@Override;
    public void getArea(){
        System.out.println("Area of cercle is : Pi*r*r");
    }

}
class Rectangle extends twoDShap
{
    //@Override;
    public void getArea(){
        System.out.println("Area of Ractangle is : l*w");
    }

}
class Square extends twoDShap
{
    //@Override;
    public void getArea(){
        System.out.println("Area of Square is : a*a");
    }

}
