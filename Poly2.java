package test;

interface I{}
interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface believer{}

class Steve implements father, programmer, believer{
	public void coding() {
		System.out.println("fast");
	}
}
class Steve2 implements father, programmer, believer{
	public void coding() {
		System.out.println("slow");
	}
}
class AAA {
	protected int x = 100;
}
class BBB extends AAA {
	int y = 300;
}
class CCC extends AAA {
	int z = 400;
}

class C implements I{}

class AA {
	public String toString() {
		return "AAAA";
	}
}

class BB {
	public String t() {
		return "BBBB";
	}
}
public class Poly2 {

	public static void main(String[] args) {

		Object[] obj = new Object[2];
		obj[0] = new AA();
		obj[1] = new BB();

		for (int i = 0; i < obj.length; ++i) {
			System.out.println("obj[" + i + "] = " + obj[i]);
		}
		
		  Object a = new AA(); Object b = new BB(); 
		  System.out.println("a = " +a.toString() );
		  System.out.println("b = " +b.toString());
		 
		
	}

}
interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
