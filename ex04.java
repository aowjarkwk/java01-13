package examples;

public class ex04 {

	public static void main(String[] args) {
		//데이터(변수) 타입(Type, 형)
	    
		//             자바              자바스크립트  var/const
	    //            타입 지정함           타입 지정이 없음 - 값이 할당될때
	    // 널          null                 null
	    //             없음(에러)           undefined(초기값 없을때)
	    //정수형    int(4) short(2)         number
	    //          long(8) byte(1)             
	    //실수형    float(4) double(8)      number
	    //논리형    boolean                 boolean
	    //문자열형  String(클래스)          string
	    //문자형    char                    string
	    //함수형    람다식(익명함수)        function
	    //객체형    클래스객체 new          object
		
	    //함수      지원                    지원
	    //클래스    지원                    지원(버전업)
		
		//정수형 변수를 하나 선언해보자
		int myInt = 10;
		System.out.println(myInt);
		
		//실수형 변수
		float myFloat = 3.14f; //리터럴(데이터) 뒤에 f를 넣어줘야함.
		System.out.println(myFloat);
		double myDouble = 4.25;
		System.out.println(myDouble);


	}

}
