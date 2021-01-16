package org.oop;

public class Points {
    private double x;
    private double y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Points from, Points to) {
        double xDistance = to.x - from.x;
        double yDistance = to.y - from.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Points from, Points to) {
        double xDistance = to.x - from.x;
        double yDistance = to.y - from.y;
        return Math.atan2(yDistance, xDistance);
    }

}


