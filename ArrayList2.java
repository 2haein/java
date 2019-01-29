package test;
import java.util.ArrayList;

class Person<T>{
	public T info;
}

public class ArrayList2 {

	public static void main(String[] args) {
		
		Person<String>p1= new Person<String>();
		Person<StringBuilder>p2= new Person<StringBuilder>();
		
		System.out.println(p1.info);

		String[] arrayObj= new String[2];
		arrayObj[0]="one";
		arrayObj[1]="two";
		
		for(int i=0;i<arrayObj.length;i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("three");
		
		for(int i=0;i<al.size();i++)
		{
			String value=(String)al.get(i);
			
			System.out.print(al.get(i));
			System.out.println(value);
			
		}
		
		
		
	}

}
