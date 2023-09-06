package day06;

public class MyRoom {

	public static void main(String[] args) {
		
		TV t1=new TV();//
		
		TV t2=new TV();
		
		System.out.println(t1.info());
		
		t1.color="white";
		t1.size=72;
		t1.channel=7;
		
		t2.color="gray";
		t2.size=50;
		t2.channel=11;
		
		
		System.out.println(t1.info());//1회용

		String str=t2.info();//str => 재사용 가능
		System.out.println(str);
		
		//t1의 채널 22로 변경해보자
		t1.changeChannel(22);
		System.out.println(t1.channel);
		System.out.println(t1.state);
		t1.powerOn();//전원 켜기
		System.out.println(t1.state);
		
		//t1 전원 켜기
		t2.wifi="SK"; //static변수 ==> 객체들마다 공유한다
		System.out.println(t2.info());
		
		System.out.println(t1.info());
		
	}

}




