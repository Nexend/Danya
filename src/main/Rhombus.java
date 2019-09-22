package main;

public class Rhombus extends Quadrangle{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;

    Rhombus(){};
    public Rhombus(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public double angle() {
        return (x2 * x3 + y2 * y3)/(Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1) , 2)) * Math.sqrt(Math.pow((x4 - x2), 2) + Math.pow((y2 - y1) , 2)))/2;
    }

    public void check() {
        if(angle() == 0) {
            System.out.println("Фигура является ромбом!");
        }
    }

    public double square() {
        return (Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1) , 2)) * Math.sqrt(Math.pow((x4 - x2), 2) + Math.pow((y2 - y1) , 2)))/2;
    }

    public void info() {
        if (angle() == 0) {
            System.out.println("Площадь: " + String.format("%6.2f", square()));
        } else {
            System.out.println("Фигура не является ромбом");
        }
    }

    @Override
    public double diagonal1() {
        return super.diagonal1();
    }

    @Override
    public double diagonal2() {
        return super.diagonal2();
    }

}
