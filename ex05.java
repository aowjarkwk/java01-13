package examples;

public class ex05 {

	public static void main(String[] args) {
		
		//정수형 변수 선언
		int age = 20;
		System.out.println("나이는 "+age);
		
		//같은 타입 변수는선언을 이어서 해도 된다.
		int a = 10, b = 20;
		int a2 = 10;
		int b2 = 20;
		
		int a3; //선언만 하고 초기 값이 없음.
		        // 초기값은?  에러가 난다
		a3 = 30; //나중에 값을 넣어줌.
		System.out.println(a3);
		//연습문제 - DM 제출
		//정수형 변수 num을 선언하고 100을 넣고
		//"num은 100입니다."라고 출력하시오.
		int num = 100;
		System.out.println("num은 "+num+"입니다.");
		//실수형 변수 num2를 선언하고 5.24f을 넣고
		//"num2는 5.24입니다."라고 출력하시오.
		
		float num2 = 5.24f;
		System.out.println("num2는 "+num2+"입니다.");
	}

}
