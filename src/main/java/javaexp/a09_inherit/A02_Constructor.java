package javaexp.a09_inherit;

public class A02_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 부모 생성자 호출 : super() cf) super(상속의 상위지칭), this(현재 클래스 지칭)
		
		1. 상속하는 클래스는 부모의 생성자를 반드시 호출하여야 한다.
			1) default 생성자는 기본적 default 생성자를 호출하기 때문에 선언하지 않더라도 에러가 없다.
				- 자바의 모든 클래스는 extends Object로 상속을 받아서 처리한다.
					그래서 default이기에 선언하지 않는다.
				class Father extends Object{}
				class Son extends Father{
					public Son(){
						super();
					}
				}
			2) 상위 클래스에서 매개변수가 있는 생성자를 선언했을 때
				class Mother{
					String name;
					Mother(String name){
						this.name = name;
					}
				}
				class Daughter extends Mother{
					Daughter(String name){
						super(name); // 반드시 상위에 있는 생성자 호출
					}
				}
			# 부모 없는 자식이 없듯이 부모의 생성자가 선언되면 반드시 해당 생성자를 호출하여야 한다.
			
		# 명시적 부모 생성자 호출
		1. 부모 객체 생성할 때, 부모 생성자 선택해 호출
			자식클래스(매개변수선언...){
				super(매개변수...);
			}
		2. super(매개변수...)
			- 매개값과 동일한 타입, 개수, 순서 맞는 부모 생성자 호출
		3. 부모 생성자 없다면 컴파일 오류 발생
		4. 반드시 자식 생성자의 첫 줄에 위치
		5. 부모 클래스에 기본(매개변수 없는) 생성자가 없다면 필수 작성
			
		 */
		Daughter01 d1 = new Daughter01("김희선");
		d1.call();
		// ex) Worker 직종을 할당하는 생성자 선언
		// Developer로 Worker를 상속 받아서 해당 직종을 처리하고 showMyjob() 기능 메서드를 통해 출력하게 하세요.
		Developer dv1 = new Developer("개발자");
		dv1.showMyJob();
		Developer dv2 = new Developer();
		dv2.showMyJob();
		dv2.showJob();
		dv1.showMyJob();

	}

}
class Worker{
	private String job;
	public String getJob() {
		return job;
	}
	Worker(String job){
		this.job = job;
	}
	void showMyJob() {
		System.out.println(job);
	}
}
class Developer extends Worker{
	public Developer() {
		super("프로그래밍 개발자");
	}
	public Developer(String job){
		super(job);
	}
	public void showJob() {
		System.out.println("직업 : " + getJob());
	}
}
class Mother01{
	String name;
	Mother01(String name){
		this.name = name;
	}
	void call() {
		System.out.println("이름 : " + name);
	}
}
class Daughter01 extends Mother01{
	/*
	Daughter01(){ super() }
	 */
	Daughter01(){
//		String name = "하이"; // 첫 라인에 다른 게 들어가면 에러
		super("하위매개값(이름)");
		// 반드시 생성자 첫 라인에 상위 클래스 선언하는 생성자의 매개변수에 맞는
		// super()로 상위 클래스의 생성자를 호출하여야 한다.
	}
	Daughter01(String name){
		super(name); // 이렇게 하면 private로 선언된 상위 필드도 접근하여 할당한다.
	}
}