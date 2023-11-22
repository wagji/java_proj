    package Chep.ex04;

    public class Typecasting2 {

	public static void main(String[] args) {
			
    int kor = 77;   //국어점수
	int eng = 88;   // 영어점수
	int math = 98;  // 수학점수
		
	// 합계 : kor + eng + math
	
	System.out.println("합계 : " + kor + eng + math ); //전체연결
		
	//평균  : ( kor +eng +math ) /3 
		
	System.out.println("캐스팅 하지않은 평균 : " +( kor + eng + math )/ 3);
	System.out.println("평균 : " + ((double)kor + eng + math )/ 3 );
		
	System.out.println("====================================");
		
	int hap = kor +eng + math  ;
	double avg = ((double) hap ) /3 ;        //hap : int ==> double 업캐스팅후에 3으로 나눔 
	
	double avg1 = hap /3 ;  //87.0                정수 / 정수 = >정수 => 더블 
	
	double avg2 =hap /3.0 ;  // 87.6666666666666667    정수 (더블 ) /더블 =>더블=>더블
	
	System.out.println("캐스팅 하지않은 평균 :" +hap);
	System.out.println("평균  :" + avg );
	
	System.out.println("=====================================");
	
	System.out.println(" avge1 : " +avg1 );
	System.out.println(" avge2 : " +avg2  );
	
	
		
		
		
		
		

	}

}
