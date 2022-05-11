package javaexp.a08_access;

public class A02_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 접근 제한자
		1. 클래스 및 클래스의 구성 멤버에 대한 접근을 제한하는 역할
			1) 다른 패키지에서 클래스를 사용하지 못하도록(클래스 제한)
				(public) class 클래스명{}
				==> 외부패키지에서 클래스명 참조변수; (public이 아니면 불가능)
				ex) Person p01; 같은 패키지일 때는 public이 없어도 되지만
					다른 패키지일 때는 public을 선언하지 않으면 에러 발생
					(접근제한자 에러)
			2) 클래스로부터 객체를 생성하지 못하도록(생성자 제한)
				public class 클래스명{
					// public 생성자(){} default 생성자 선언
					(public) 생성자(){}
				}
				==> 외부패키지에서 참조변수 = new 생성자();
				ex) p01 = new Person();
					// 외부 패키지일 때는 default 생성자이거나 명시적 public을 선언하여야 한다.
			3) 특정 필드와 메소드를 숨김 처리(필드와 메서드 제한)
				private String name; // 필드에는 보통 private
				public void call(){} // 기능메서드에는 보통 public
		2. 접근 제한자의 종류
			1) public(외부패키지에서도 import를 통해 사용 가능),
				protected,
				default(X),(같은 패키지 안에서는 사용 가능)
				private(같은 클래스에서만 사용 가능
			cf) 외부 패키지에서 해당 클래스나, 클래스 소속 멤버들을 사용할 때
				import 패키지명.클래스명, 패키지명.클래스명
				접근제한자가 public 이어야 한다.
		
		 # 이야기를 통해 외부 클래스의 필드에 대한 접근 제한을 처리해보자.
		 1. 선녀와 나무꾼
		 	1)
		 		연민정(나무꾼, 사슴)
		 			나무꾼 - 사슴이 숨은 곳(수풀 속)
		 		사냥꾼
		 		같은 패키지에 있는 클래스끼리만 접근이 가능하고, 외부 패키지에서
		 		접근이 불가능한 접근 제어자 : default(X) - 접근제어자가 붙지 않는 것
		 	
		 	2)
		 		연민정(나무꾼, 사슴)
		 			사슴 : 언제 어디로 선녀가 내려오는지?
		 			나무꾼 : 선녀의 날개옷을 숨긴 곳 - 이 객체만 접근할 수 있는 정보
		 				객체 내부에서만 전역적으로 사용하고, ㅇ
		 2. 나무꾼이 가정을 만들고, 아들을 장가까지 보내는 이야기 - (상속)
		 */

	}

}
