    package chap02.ex02;

    import java.util.Scanner;

    public class BitmiseOperartor {

    public static void main(String[] args) {
 
	// 다양한 진법표현 ,비트연산자 
	//1.다향한 진법 표현 :2진수 , 10 진수 ,8진수 , 16진  ,calc (계산기 ) 
		
	int data = 13; 
		
	//정수를 2진수로 변환 : integer.tobinarystring(정수 ) ;==> 2진수로 출력 
		
	   System.out.println(Integer.BYTES);
		
	//다양한 진법표현 ,비트연산자 
	//정수를 2진수로 변환 
		
	   System.out.println(Integer.toBinaryString(data) ); //2진수로 출력
		
	//정수를 16진수로 변환 Integer.tohexstring (정수 ) ; ==> 16진수로출력
	   System.out.println(Integer.toHexString(data) ); //
		 
		//정수를 8진수로 변환 //
		System.out.println(Integer.toOctalString(data));//8진수로 출력
		
	  //문자 열로 된 숫자를 정수 타입으로 변환  <==== 중요 ,많이 사용함 
		
		System.out.println("3"+"5");// 문자열 +문자열 = 문자열 연결 
		
     	// Integer.parseInt("숫자로된 정수 " ) ; == >정수 타입으로 저장됨  많이사용
		
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5")); // 8 
		
	  // 문자열로 된 실수 를 실수 타입으로 변환  < == 실수 타입으로 저장 
	  // Double.parsedouble 
		
		System.out.println("13.5" + " 17.77 " ); // 13.517.77 
		System.out.println(Double.parseDouble("13.5")+Double.parseDouble("17.77"));
		
		System.out.println("=======================================================");
	 // 스캐너에서 숫자가 문자열로 들어왔을 때 정수로 변환 ,실수로 변환 후 연산 
		
		Scanner sc = new Scanner (System.in); // ctrl + shifr ++o 
		
		String kor ;
		String eng ;
		String avg ;
		
		System.out.println("국어점수 (정수) 영어점수 (정수) 평균 (실수)로 입력 해 주세요.>>>> ");
		
		kor =sc.next();
		eng = sc.next();
		avg = sc.next();
		
		// int hap = kor+ avg ; //오류발생 ,타입이 맞지 않음 
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng) ;
		
		System.out.println("국어점수 +영어점수 :" + ( kor + eng ));
		System.out.println("평균 출력 : " + Double.parseDouble(avg));
		
		
		
		
	}

}
