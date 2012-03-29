package com.telmomenezes.jfastemd;

public class Feature2D implements Feature {
    double x;
    double y;

    public Feature2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double groundDist(Feature f) {
        Feature2D f2d = (Feature2D)f;
        double deltaX = x - f2d.x;
        double deltaY = y - f2d.y;
        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
    }
}