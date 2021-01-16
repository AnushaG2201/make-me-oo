package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointsTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Points origin = new Points(0, 0);
        Assertions.assertEquals(0, Points.distance(origin, origin));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Points origin = new Points(0, 0);
        Points point1 = new Points(1, 0);
        Points point2 = new Points(0, 1);

        Assertions.assertEquals(1, Points.distance(origin, point1));
        Assertions.assertEquals(1, Points.distance(origin, point2));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Points point1 = new Points(1, 0);
        Points point2 = new Points(-1, 0);

        Assertions.assertEquals(2, Points.distance(point1, point2), 1);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Points origin = new Points(0, 0);
        Points point1 = new Points(1, 0);
        Points point2 = new Points(3, 0);

        Assertions.assertEquals(0, Points.direction(origin, point1));
        Assertions.assertEquals(0, Points.direction(origin, point2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Points origin = new Points(0, 0);
        Points point1 = new Points(-1, 0);
        Points point2 = new Points(-3, 0);

        Assertions.assertEquals(Math.PI, Points.direction(origin, point1));
        Assertions.assertEquals(Math.PI, Points.direction(origin, point2));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Points origin = new Points(0, 0);
        Points point1 = new Points(0, 1);
        Points point2 = new Points(0, 3);

        Assertions.assertEquals(Math.PI / 2, Points.direction(origin, point2));
        Assertions.assertEquals(Math.PI / 2, Points.direction(origin, point1));
    }
}

