package jpl.exercises.chapter9;

/**
 * ( 几何 ： 正 n 边形 ）
 * @author fengyang
 * @since 2018/1/10
 */
class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    public RegularPolygon(){
        n=3;
        side=1;
        x=y=0;
    }

    public RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;
    }

    public RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n=n;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y=y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public  double getArea(){
        return n*side*side/(4*Math.tan(Math.PI/n));
    }
}


public class Exercise9 {
    public static void printRegularPolygonInfo(RegularPolygon regularPolygon){
        System.out.println(String.format("Pirimeter: %f",regularPolygon.getPerimeter()));
        System.out.println(String.format("Area: %f",regularPolygon.getArea()));
    }

    public static void main(String[] args){
        RegularPolygon regularPolygon1=new RegularPolygon();
        RegularPolygon regularPolygon2=new RegularPolygon(6,4);
        RegularPolygon regularPolygon3=new RegularPolygon(10,4,5.6,7.8);
        printRegularPolygonInfo(regularPolygon1);
        printRegularPolygonInfo(regularPolygon2);
        printRegularPolygonInfo(regularPolygon3);
    }

}
