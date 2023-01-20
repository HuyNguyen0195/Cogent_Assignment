package CoreJava_Day_1;
import java.util.Scanner;


public class Rectangel {	
	private float lenght;
	private float width;
	
	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		if(lenght<0 || lenght>20 ) {
			throw new IllegalArgumentException("length is out of range");
		}
		this.lenght = lenght;
	}
	
	public float getwidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width<0 || width>20 ) {
			throw new IllegalArgumentException("width is out of range");
		}
		this.width = width;
	}
	// constructor
	public Rectangel() {
		this.lenght = 1;
		this.width = 1;
	}
	public Rectangel(float lenght, float width) {
		if(lenght<0 || lenght>20 ) {
			throw new IllegalArgumentException("length is out of range");
		}
		this.lenght = lenght;		if(width<0 || width>20 ) {
			throw new IllegalArgumentException("width is out of range");
		}
		this.width = width;	
	}
	public void perimeter() {
		System.out.println("perimete is:"+ ((lenght+width)*2));
	}
	//method calculate and shows
	public void printResult() {
		System.out.println("Lenght : "+lenght);
		System.out.println("width : "+width);
		System.out.println("area : "+(lenght*width));
		perimeter();
	}
	

}
