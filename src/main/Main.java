package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во четырёхугольников: ");
        int quantity = scanner.nextInt();
        double [] arr1 = new double[quantity];
        int x1,y1,x2,y2,x3,y3,x4,y4;
        for ( int i = 0; i < quantity; i++ ) {
            System.out.println("Введите x1: ");
            x1 = scanner.nextInt();
            System.out.println("Введите y1: ");
            y1 = scanner.nextInt();
            System.out.println("Введите x2: ");
            x2 = scanner.nextInt();
            System.out.println("Введите y2: ");
            y2 = scanner.nextInt();
            System.out.println("Введите x3: ");
            x3 = scanner.nextInt();
            System.out.println("Введите y3: ");
            y3 = scanner.nextInt();
            System.out.println("Введите x4: ");
            x4 = scanner.nextInt();
            System.out.println("Введите y4: ");
            y4 = scanner.nextInt();

            Quadrangle quadrangle = new Quadrangle(x1, y1, x2, y2, x3, y3, x4, y4);
            arr1[i] = quadrangle.perimeter();

            quadrangle.info();
            Rhombus rhombus = new Rhombus(x1, y1, x2, y2, x3, y3, x4, y4);
            rhombus.check();
        }
        double min = arr1[0];
        for (double p : arr1){
            if (min > p){
                min = p;
            }
        }
        System.out.println("Минимальный периметр: " + String.format("%6.2f", min));

        System.out.println("\nВведите кол-во ромбов: ");
        quantity = scanner.nextInt();
        double [] arr = new double[quantity];
        ArrayList<Double> arrayList = new ArrayList<>();
        for ( int j = 0; j < quantity; j++ ) {
            System.out.println("Введите первую координату: ");
            x1 = scanner.nextInt();
            System.out.println("Введите вторую координату: ");
            x2 = scanner.nextInt();
            System.out.println("Введите третью координату: ");
            x3 = scanner.nextInt();
            System.out.println("Введите четвертую координату: ");
            x4 = scanner.nextInt();
            System.out.println("Введите пятую координату: ");
            y1 = scanner.nextInt();
            System.out.println("Введите шестую координату: ");
            y2 = scanner.nextInt();
            System.out.println("Введите седьмую координату: ");
            y3 = scanner.nextInt();
            System.out.println("Введите восьмую координату: ");
            y4 = scanner.nextInt();

            Rhombus rhombus = new Rhombus(x1, y1, x2, y2, x3, y3, x4, y4);
            if (rhombus.angle() == 0) {
                arr[j] = rhombus.square();
            }
            else {
                arr[j] = 0;
            }
            if (arr[j] > 0){
                arrayList.add(arr[j]);
            }
            rhombus.check();
            rhombus.info();
        }
        Double [] array = arrayList.toArray( new Double[ arrayList.size() ] );
        double sum = 0;
        for (double i : array) {
            sum = sum + i;
        }
        double average = sum / array.length;
        System.out.println("Средняя площадь ромбов:" + String.format("%6.2f",average));
    }
}
