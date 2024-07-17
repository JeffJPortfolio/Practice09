package com.javaex.ex04;

public class RectTriangle extends Shape {
    private double width;
    private double height;
    
    public RectTriangle() {
    	
    }
    
    public RectTriangle(double width, double height) {
    	this.width = width;
    	this.height = height;
    }
    
    public double getArea(){
    	return (this.width * this.height)/2 ;
    }

    public double getPerimeter() {
    	return this.width + this.height + (Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2)));
    }
    
}