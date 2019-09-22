package main;

public class Quadrangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;

    Quadrangle(){};
    Quadrangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public double length1() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2));
    }
    public double length2() {
        return Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2) , 2));
    }
    public double length3() {
        return Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3) , 2));
    }
    public double length4() {
        return Math.sqrt(Math.pow((x1 - x4), 2) + Math.pow((y1 - y4) , 2));
    }

    public double perimeter() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2)) + Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2) , 2)) + Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3) , 2)) + Math.sqrt(Math.pow((x1 - x4), 2) + Math.pow((y1 - y4) , 2));
    }

    public double diagonal1() {
        return Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1) , 2));
    }

    public double diagonal2() {
        return Math.sqrt(Math.pow((x4 - x2), 2) + Math.pow((y4 - y2) , 2));
    }

    public double square() {
        return Math.sqrt((perimeter()/2 - length1())*(perimeter()/2 - length2())*(perimeter()/2 - length3())*(perimeter()/2 - length4()));
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public void info() {
        System.out.println("Первая сторона: " + String.format("%6.2f", length1()));
        System.out.println("Вторая сторона: " + String.format("%6.2f", length2()));
        System.out.println("Третья сторона: " + String.format("%6.2f", length3()));
        System.out.println("Четвертая сторона: " + String.format("%6.2f", length4()));
        System.out.println("Периметр: " + String.format("%6.2f", perimeter()));
        System.out.println("Площадь: " + String.format("%6.2f", square()));
        System.out.println("Первая диагональ: " + String.format("%6.2f", diagonal1()));
        System.out.println("Вторая диагональ: " + String.format("%6.2f", diagonal2()));
    }
}
