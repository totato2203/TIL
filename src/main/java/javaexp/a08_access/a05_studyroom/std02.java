package javaexp.a08_access.a05_studyroom;

import javaexp.a08_access.a04_playroom.frd01;

public class std02 {

	void callInfo() {
		
		frd01 frd = new frd01();
//		System.out.println(frd.privInfo); private은 같은 클래스 내에서만 호출 가능
//		System.out.println(frd.normInfo); default는 같은 패키지 내에서만 호출 가능
		System.out.println(frd.publInfo); // import를 통해 외부 패키지에서도 호출 가능
		
		std01 std = new std01();
//		System.out.println(std.privInfo); private은 같은 클래스 내에서만 호출 가능
		System.out.println(std.normInfo); 
		System.out.println(std.publInfo);
	}
}
