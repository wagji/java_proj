package chap02.ex02;

public class RangeOfVarlable {
	public static void main(String[] args) {
		//main 메소드 : 코드 작성 .
		//메소드 : 객체지향 언어에서 함수를 =매소드라고 호칭함.
	
		// 변수의 사용 범위 :전역 변수 ,지역 변수 .
		
		//전역변수  :  선언된 곳에서만 유효 함 .
		int a=10 ; 
		
		{ // fi,swich,for,wile,do~wile . <== 제어문 ,안쪽문 
			//지역변수 :  그 블락 내에서만 사용됨 .
			 
			int b = 20 ;
		
			 System.out.println("a 변수의 값을 출력 (내부출력 ) : " +a );
			 System.out.println( "b 변수의 값을 출력 (내부출력) :" +a );
			 {
				int c =30 ;
				
			
				System.out.println("====================================");
			
				
				System.out.println(" 블락의 블락 a : " + a);
				System.out.println(" 블락의 블락 a : " + b);
				System.out.println(" 블락의 블락 a : " + c);
				
				
				System.out.println("====================================");
				 
			 } 
			 
///			 System.out.println(" 블락의 블락 a : " + c);
			 
		
		 
		}
		
		System.out.println(" a 변수의 값을 출력 (외부출력) :" +a );
		// System.out.println(" b변수의 값을 출력 (외부블럭) : " +b );                   
				
		
		
		
		
	}
	
	
}
