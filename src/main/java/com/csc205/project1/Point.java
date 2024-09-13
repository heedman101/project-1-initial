package com.csc205.project1;

public class Point{

    //class variables
    private double x;
    private double y;

    //constructor
    public Point(){
        x = 0;
        y = 0;
    }
    //parameterized constructor that takes in starting values for x and y
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point p2){
        double dx = p2.getX() - x;
        double dy = p2.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    //getters for x
    public double getX(){
        return x;
    }
    //setters for x
    public void setX(double x){
        this.x = x;
    }
    //getters for y
    public double getY(){
        return y;
    }

    //setters for y
    public void setY(double y){
        this.y = y;
    }
    //setter for x & y
    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    //shifts the x value by n
    public void shiftX(double n){
        x += n;
    }
    //shifts the y value by n
    public void shiftY(double n){
        y += n;
    }
    //rotates the point by the given angle in radians
    public void rotate(double angle){
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }
    public String toString (){
    return "(" + x + ", " + y + ")";
    }
}