package studio7;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle(double instLength, double instWidth) {
		this.length = instLength;
		this.width = instWidth;
		this.area = instLength*instWidth;
		this.perimeter = 2*(instLength+instWidth);
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSmaller(double otherArea) {
		if (this.area < otherArea) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Rectangle r1 = new Rectangle(in.nextDouble(), in.nextDouble());
		Rectangle r2 = new Rectangle(in.nextDouble(), in.nextDouble());
		System.out.println("Rectangle 1:  Area: " + r1.getArea() + " Perimeter: " + r1.getPerimeter() + " Square? " + r1.isSquare());
		System.out.println("Rectangle 2:  Area: " + r2.getArea() + " Perimeter: " + r2.getPerimeter() + " Square? " + r2.isSquare());
		if (r1.isSmaller(r2.getArea())) {
			System.out.println("Rectangle 1 is smaller than Rectangle 2");
		}
		if (r2.isSmaller(r1.getArea())) {
			System.out.println("Rectangle 2 is smaller than Rectangle 1");
		}
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(Color.RED);
		StdDraw.rectangle(0.5, 0.5, r1.getWidth()/2, r1.getLength()/2);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.rectangle(0.5, 0.5, r2.getWidth()/2, r2.getLength()/2);
		in.close();
	}
	
}
