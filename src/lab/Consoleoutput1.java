package lab;

public class Consoleoutput1 {

	public static void main(String[] args) {

		// 변수 선언  :소문자시작 ,단어가 이어질때 첫자를 대문자로 변수명 할당 (케밀케이스) 
		
		String fatherName = "홍길동";
		String motherName = "홍길선";
		String myName = "홍당무";
			 	 
		 String str1 = "홍길동 " ;
		 String str2 = "홍길선 ";
		 String str3 = "홍당무 ";
		
		int age =30 ;
		int a=30 ; 
		
		double weith1 =70.5 ;
		double weith2= 50.7;
		
		double b =70.5 ;
		
		
		// println () : 출력 
		
	 System.out.println("우리 아버님 이름은 : "+ str1 + "이고 " +  "우리어머님 이름은 :" + str2 + " 입니다") ;
	 System.out.println("나의 이름은 :"+ str3 +"이고" + "나이는 : "+ a + " 이고" + "몸무게는 "+ b+ "입니다 ") ;
	 
		
		//출력내용  :우리 아버님 이름은 홍길동이고 , 우리어머님 이름은 홍길선입니다.
		//         나의 이름은 홍당무 이고 ,나이는 30살 이고 ,몸무게는 70.5 킬로 입니다 .
		//printf () : 출력 
		
	 System.out.printf("우리 아버님 이름은 %s 이고, 우리 어머님 이름은 %s 입니다 . \n ",fatherName ,motherName) ;
	System.out.printf("나의 이름은 %s 이고, 나이는 %d 살이고, 몸무게는 %4.1f 입니다. " , myName ,age , b );
 
	
	
	
	
	
		
		
		
		
		
		
	}

  }
