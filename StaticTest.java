package day06;

class Car{
	static String b="나는 Car's 클래스변수";
	double a=50.5;//인스턴스 변수
	
}//Car class ///////////////////

public class StaticTest {
	
		   int a=10;//인스턴스 변수
	static int b=20;//클래스 변수

	public static void main(String[] args) { //==>선발대
		//b 값을 출력하세요
		System.out.println("StaticTest.b="+StaticTest.b);	
		System.out.println("b: "+b);
		System.out.println("---------------------------");
		
		//Car의 b값 출력하세요
		System.out.println("Car.b="+Car.b);
		
		//Car의 a값 출력하세요
		//System.out.println("Car.a="+Car.a);[x]
		Car c1=new Car();
		System.out.println("c1.a="+c1.a);//[o] 인스턴스명.변수
		
		//StaticTest의 a값 출력하세요
		//System.out.println("a: "+a);//[x]
		StaticTest st=new StaticTest();//객체생성 => 후발대
		System.out.println("st.a="+st.a);
		
		System.out.println("st.b="+st.b);//20
		
		
	}

}
