package examples;

public class ex07 {

	public static void main(String[] args) {
		
		//정수형변수 x에 10을 넣고,
		//정수형변수 y에 20을 넣는다.
		//x와 y값을 출력하시오.
		//정수형변수 temp를 만들어서,
		//x와 y의 값을 서로 교환(SWAP)하고, 출력하시오.
			int x=10,y=20;
			System.out.println("x="+x);
			System.out.println("y="+y);
			int temp;
			temp=x;
			x=y;
			y=temp;
			
			
			System.out.println("x="+x);
			System.out.println("y="+y);
			
			}
		

	

}
