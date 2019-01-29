package test;

interface Info{
	int getLevel();
}

class EmployeeInfo implements Info{
	public int rank;
	EmployeeInfo(int rank){this.rank=rank;}
	public int getLevel() {
		return this.rank;
	}
}
class Person1<T,S>{
	public T info;
	public S id;
	Person1(T info, S id){
		this.info= info;
		this.id= id;
	}
}


public class GenericDemo {
	public static void main(String[] args) {
		EmployeeInfo e= new EmployeeInfo(1);
		Integer i= new Integer(10);

		Person1<EmployeeInfo, Integer>p1= new Person1<EmployeeInfo, Integer>(e,i);
		Person1 p2= new Person1(3,5);
		System.out.println(p1.id.intValue());
		System.out.println(p2.id);
		
	}

}
