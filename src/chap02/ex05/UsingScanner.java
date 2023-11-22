    package chap02.ex05;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {

	//외부의 라이브러리 사용 하기 :  java 에서 만들어진  class 묶음을 라이브러리 
    // import 가 필요함 . // javalang 패키지의 클라스는 import 없이 바로 사용 가능 
		
	System.out.println();
	String a ;
	Integer b ;
	Double c ;
	Long d ;
	
	/* Scanner : 콘솔로부터 입력값을 받아오는 클라스 (객체 )
	 *- 외부 클래스  : java ,lang 외부에 존재하는 클라스 <== import 가  필요함 
	 *-동일한 패키지에 존재는 클라스는 import 없이 사용 가능 .
	 *-동일한 패키지에 존재하지 않는 클라스는 import 를 
	 *-java.utill.Scanner  : 클래스의 전체 이름 :패키지명 , 클래스명
	 ctrl + shift + o :             자동으로 import
	 콘솔에서 값을 넣고 엔터를 넣으면 다음 스캐너에서 입력대기 
	 *
	 */ 
	//스캐너 객체 생성 
	
	// 참조 타입/객체수형 =new (힙에 객체의 값을 저장하겠다 .
	
	Scanner sc = new Scanner(System.in ) ;
	
	//변수 선언 
	
	String fName  ; // 아버님이름
	String mName ;  // 어머님이름 
	String myName ;  //나의이름
	
	
	System.out.println("아버님 이름을 입력하세요 >>> ");	
	fName = sc.next(); //   fName = sc.next() : 콘솔로 부터 "문자열 "을 인풋 받음 
	System.out.println("어머님 이름을 입력하세요 >>> ");
	mName =sc.next() ;
	System.out.println("나의 이름을 입력하세요 >>> ");
	myName = sc.next() ;
	
	
	System.out.println("입력 받은 아버님 이름은 : " + fName);
	System.out.println("입력 받은 어머님 이름은 : " + mName);
	System.out.println("입력 받은 나의 이름은 : " + myName );

	// 스캐너로 정수값 입력 받기  :
	// 변수 선언만됨 ,같은 스캐너로 받아서 할당 
	
	int aa ;
	int bb ; 
	int cc ;
	
	// 스캐너로 변수의 값을 할당
	 System.out.println("aa bb cc 변수의 정수값을 공백으로 입력 하세요 >>>>");
		
		aa = sc.nextInt() ;   //콘솔에서 정수를 입력 
		bb = sc.nextInt() ;
		cc = sc.nextInt() ;
		
		System.out.println(" aa : " + aa  + "\nbb : " + bb + "\ncc : " + cc  );
		
		
	
		
		
		
	}

}
