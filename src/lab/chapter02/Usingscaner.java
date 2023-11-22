package lab.chapter02;

import java.util.Scanner;

public class Usingscaner { 

private static String myName;

public static void main(String[] args) { 

	        //스캐너로 각변수의 값을 인풋 받아서 
		Scanner sc = new Scanner (System.in) ;
		
		String stu = myName ; // 학생 1

		int kor = 99 ;  //국어점수
		int eng = 88 ;  // 영어 점수
		int math = 77 ; // 수학점수
		
		int hap =kor+eng+math ; //점수의 합계
						
		double avg = ((double)hap /3 ) ;  //평균을
		
		System.out.println("학생 1의 이름 국어점수 영어점수 수학점수 를 입력 하세요 >>>>");
		stu = sc.next(); //콘솔에서 인풋을 대기 
		kor = sc.nextInt();
		eng = sc.nextInt() ;
		math = sc.nextInt() ;
		hap = kor+ eng+ math ;
		avg = hap /3.0 ;
		
		// 코드 부분 
		System.out.println(stu + "  의 모든 점수의 합계는 "+hap +"점 이고 평균은" +avg +"  입니다.");
		System.out.println("===============================================");
		
		

		
		System.out.println("학생 2의 이름 국어점수 영어점수 수학점수 를 입력 하세요 >>>>");
		stu = sc.next(); //콘솔에서 인풋을 대기 
		kor = sc.nextInt();
		eng = sc.nextInt() ;
		math = sc.nextInt() ;
		hap = kor+ eng+ math ;
		avg = hap /3.0 ;
		
		// 코드 부분 
		System.out.println(stu + "  의 모든 점수의 합계는 "+hap +"점 이고 평균은" +avg +"  입니다.");
		System.out.println("===============================================");
		
		

		System.out.println("학생 3의 이름 국어점수 영어점수 수학점수 를 입력 하세요 >>>>");
		stu = sc.next(); //콘솔에서 인풋을 대기 
		kor = sc.nextInt();
		eng = sc.nextInt() ;
		math = sc.nextInt() ;
		hap = kor+ eng+ math ;
		avg = hap /3.0 ;
		
		// 코드 부분 
		System.out.println(stu + "  의 모든 점수의 합계는 "+hap +"점 이고 평균은" +avg +"  입니다.");
		System.out.println("===============================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
