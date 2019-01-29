package test;


public class Poly {

	public static void main(String[] args) {
		
		Buyer b= new Buyer();
		Tv tv= new Tv();
		Computer com= new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("���糲���� "+b.money+"�����Դϴ�");
		System.out.println("���纸�ʽ� "+b.bonusPoint+"��");
	}
}

class Parent{
	
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
		
	}
	
}

class Child extends Parent{
	int x=200;
	void method() {
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
}


class FireEngine{
	void water() {
		System.out.println("water");
	}
}
class Product{
	public int price;
	public int bonusPoint;
	Product(int price){
		this.price= price;
		this.bonusPoint=(int)(price/10);
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
		
	}
	public String toString() {
		return "Computer";
	}
}
class Buyer{
	int money=1000;
	int bonusPoint=0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
}
