package chp3ex01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArithericOperator {

	private static int va12;
	public static void main(String[] args) {
 /*
  * 산술 연산자 : +, -, + ,* ,/, %  (나머지만 출력
  *  증강 연산자 : ++ (1식증가 ), -- (1식 감소 )  < ==변수앞, 변수 뒤 
  *  
  */
//1.산술 연산자 
		int a = 5;
		int b = 10 ;
		System.out.println(a + b); //15
		System.out.println(a - b);  //-5
		System.out.println(a * b);//  50
		System.out.println(a / b); //나누어서 목만 출력
		System.out.println(a % b); //나머지만 출력 < ==중요 
		
		 
		// 캐스 해서 연산  
		System.out.println(  2 +(double )  3);  //5.0
		System.out.println(10%5);
		 //값 % 3 = 0일때 같은 3의배수
		 // 값% 5=0 일때 같은 5의배수
		System.out.println( 8 /5 ); // 목만 출력
		System.out.println(8 / 5.0) ; // 나머지만 출력 
		 System.out.println( "===================");
		 
		 //2 . 증감 연산자 : ++ ,--
		int va110 =30 ;
		int va111 =30 ;
		int va112 = 40 ;
		int va113 = 7+ -- va110 + ++va111 + va112 -- ; ///7+29+41+50 =
				System.out.println("va 113:" + va113);
				System.out.println(va110 ); //29
				System.out.println(va111); //41
				System.out.println(va112 ); //49
				
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
	}

}
