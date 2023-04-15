package org.singleton;

public class Test {
	public static void main(String[] args) {
		SingletonTreinee singletonTreinee = SingletonTreinee.getSingleton();
		SingletonTreinee.printCounter();

		JuniorSingleton juniorSingleton = JuniorSingleton.getSingleton();
		JuniorSingleton.printCounter();

		SeniorSingleton singleton = SeniorSingleton.getInstance();
		System.out.println(singleton.toString());
		SeniorSingleton.printCounter();
		
		Geom[] geoms = new Geom[5];
		
		geoms[0] = new Point();
		geoms[1] = new Line();
		geoms[2] = new Triangle();
		geoms[3] = new Rectangle();
		geoms[4] = new Ellipse();

		
		for (int i=0; i<5; i++) {
			geoms[i].draw();
			if (geoms[i] instanceof Line) {
				((Line)geoms[i]).boardLine();
			}
		}
		

	}
}

abstract class Geom {
	public abstract void draw(); 
}

class Point extends Geom {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}

class Line extends Point {
	public void boardLine() {
		System.out.println("----------");
	}
}

class Triangle extends Line {

}

class Rectangle extends Line {

}

class Ellipse extends Line {

}