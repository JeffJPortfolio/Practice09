package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;
    
    public Rectangle() {
    	
    }
    
    public Rectangle( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
    	return (this.width * this.height) ;
    }

    public double getPerimeter() {
    	return (this.width + this.height)*2;
    }; // 둘레 길이
    
    public void resize(double s) {
    	this.width *= s;
    	this.height *= s;
    }
}