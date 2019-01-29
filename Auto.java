package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Auto{

	public static void main(String[] args) {
		for(Fruit f: Fruit.values()) {
			System.out.println(f+","+f.getColor());
		}
	}

}

enum Fruit{
	Apple("red"),Peach("pink"), Banana("yellow");
	private String color;
	Fruit(String color){
		System.out.println("Call Constructor"+this);
		this.color= color;
	}
String getColor() {
	return this.color;
}
}
enum Company{
	GOOGLE, APPLE, ORACLE;
}
