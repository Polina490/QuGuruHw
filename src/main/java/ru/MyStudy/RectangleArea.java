package ru.MyStudy;

public class RectangleArea {
    double oneSide;
    double firstSide;

    public RectangleArea(double oneSide, double firstSide) {
        this.oneSide = oneSide;
        this.firstSide = firstSide;
    }

    double areaCalculation(){
        double area;
        area = this.oneSide * this.firstSide;
        return area;
    }
}
