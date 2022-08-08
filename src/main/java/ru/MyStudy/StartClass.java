package ru.MyStudy;

import java.util.Scanner;

public class StartClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double oneSide;
        double firstSide;

        System.out.println("Введите значение первой стороны");
        oneSide= in.nextDouble();
        System.out.println("Введите значение второй стороны");
        firstSide = in.nextDouble();

        RectangleArea area = new RectangleArea(oneSide, firstSide);

        System.out.println("Площадь вашего прямоугольника равна " + area.areaCalculation());

    }
}
