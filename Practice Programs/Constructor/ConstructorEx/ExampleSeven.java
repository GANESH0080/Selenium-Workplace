package ConstructorEx;

public class ExampleSeven 
{
private int l;
private int h;
private int b;
public int getL() {
	return l;
}
public void setL(int l) {
	this.l = l;
}
public int getH() {
	return h;
}
public void setH(int h) {
	this.h = h;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}

ExampleSeven()
{
	setL(5);
	setH(4);
	setB(5);
	
	
}
	int getResult()
	{
		return  (getH()*getB()*getL());
	}
	
}

