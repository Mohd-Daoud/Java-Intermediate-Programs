package Polymorphism;

class twoDshape
{
    public void getArea()
    {
        System.out.println("Area Of 2Dshape ");
    }
}
class Circle extends twoDshape
{
//    @Override;
    public void getArea(){
        System.out.println("Area of cercle is : Pi*r*r");
    }

}
class Rectangle extends twoDshape
{
    //@Override;
    public void getArea(){
        System.out.println("Area of Ractangle is : l*w");
    }

}
class Square extends twoDshape
{
    //@Override;
    public void getArea(){
        System.out.println("Area of Square is : a*a");
    }

}

