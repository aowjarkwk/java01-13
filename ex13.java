package examples;

public class ex13 {

	public static void main(String[] args) {
		// 숫자형 변수 타입
		// 정수형
		// int-4byte long-8byte short-2byte byte-1byte
		
		//실수형
		//float  4byte
		//double  8byte
		
		//byte바이트 bit비트 ?
		//1bit : 0/1 둘중 하나
		//8bit : 1byte
		//1kb : 1024byte (2의 8승:2*2*2*2*2*2*2*2 = 1024)
		//1mb : 1024kb
		//1gb : 1024mb
		//1tb : 1024gb
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		int numInt = 32767; //정수형 4바이트

		long numLong = 123812380L; //L은 Long형 변수 값을 의미함.
		short numShort = 127; //2byte : 2^16승
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
	}

}
