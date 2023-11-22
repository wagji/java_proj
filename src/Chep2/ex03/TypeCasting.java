package Chep2.ex03;

public class TypeCasting {

	public static void main(String[] args) {
     
		/*  Typecasting  :자료형의 형식을 변환 
        기본 자료형 8가지 :RAm: stack 공간      공간 변수명 ,값  
          
        byte  < short /char <int <long  <float < double
        참조 자료형 , 무한대로 생성  (객체 ) :  stack 공간 <== 변수 명 (값이 위치한 참조 주소 )  , heap :값 
          
        객체 /배열 /인터페이스 
		
	    자동으로 캐스팅 : 업캐스팅 (낮은 자료형에서 높은 자료형으로 자동으로 일어남 ) 
        수동으로 캐스팅 : 다운 캐스팅 ( 높은 자료형에서 낮은자료형으로 변환 ) 
		              명시 해야됨 . 
		연산을 할때 type 이 정확 해야한다 .
		
		*
		*/
		
		
//		1.자동 캐스팅 : 업캐스팅 
		
		int a = 10;
		double b = 20.555;
		
		 // 자동으로 업캐스트 
		
		System.out.println(a + b);           //a (int ) + b (double) , int 가 자동으로 double 작업으로 업캐스팅 
		
		 // 수동으로 다운캐스트 
		
		System.out.println( (int) ( a + b ) );  //double  
	    
		System.out.println();
	    
		//변수의 값을 할당 할때
		
		double c = 100 ; //정수가 자동으로 업캐스팅되서 double 변수에 할당됨
        
		int d = (int) 200.5 ; //실수를 다운 캐스팅해서 정수 변수에 할당해야함 . 
		
		
		System.out.println(c);
		System.out.println(d); 
		
		
		
	}

}
