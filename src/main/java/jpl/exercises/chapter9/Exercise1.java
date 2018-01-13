package jpl.exercises.chapter9;

/**
 * ( 矩形类 Rectangle ) 遵照 9.2 节中 Circle 类的例子 ， 设计一个名为 Rectangle 的类表示矩形 。
 这个类包括 ：两 个 名 为 width 和 height 的 double 型数据域，它们分别表示矩形的宽和高；width 和
 height默认值都为 1。创建默认矩形的无参构造方法；一个 创 建 width 和 height 为指定值的矩形的构造方法；
 一个名为 getArea() 的方法返回这个矩形的面积；一个名为 getPerimeter()的方法返回周长 。
 画出该类的 UML 图并实现这个类 。 编写一个测试程序 . 创建两个 Rectangle 对 象:一
 个矩形的宽为 4 而高为 40 , 另一个矩形的宽为 3.5而高为 35.9。按照这个顺序显示每个矩形的
 宽 、 高 、 面积和周长 。
 */
class Rectangle{
    private double width;
    private double height;
    public Rectangle(){
        width=1;
        height=1;
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

}
public class Exercise1 {
    public static void printRectInfo(Rectangle rect){
        System.out.println(String.format("width: %f",rect.getWidth()));
        System.out.println(String.format("height: %f",rect.getHeight()));
        System.out.println(String.format("area: %f",rect.getArea()));
        System.out.println(String.format("perimeter: %f",rect.getPerimeter()));
    }
    public static void main(String[] args){
        Rectangle rectangle1=new Rectangle(4,40);
        Rectangle rectangle2=new Rectangle(3.5,35.9);
        printRectInfo(rectangle1);
        printRectInfo(rectangle2);
    }
}
