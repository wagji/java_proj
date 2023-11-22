package chap02.ex01;

        public class UsageOfDataType { //클래스 영역 
	    public static void main(String[] args) { //메인 메소드 
	    //변수 : 한번 선언후 변수의 값을 다른 값을 할당 할수있다 . 소문자로 시작해서 케일케이스 이름작성   
	    //상수 :변수 선언 앞에 final 키가 등록됨 ,상수명은 대문자 로만 지정 . 한번 값을 할당하면 그값을 수정할수 없다 .
     
		  /* 자료형: 변수/상수 를 정의 할때 반드시 자료형
	      - 기본 자료형  ( 8개)  :메모리의 Stack 공간에 변수와 같이 할당이
	      boolean, 정수 ( byte, short, int, long ) , 실수 ( float, double) , 문자 (char )
	      ( true . false ) 1byte /2byte/4byte/ 8byte            
	      
	      -참조 자료형 (무한대로 ) :메모리의 Stack 공간에 변수명 ,값은 Heap 이 저장됨 
	      첫자는 대문자 
	      객체 /배열/ 인터페이스 
	      string .: 참조자료형, 문자열을 담는다 .
	      */
	  
	      //변수선언 방법 2가지 
	      // 1. 변수 선언과 ,값은 나중에 할당 
		  int a ; // 변수 선언
		  int b ; // 변수 선언
		
		   a= 1; //변수의 값은 나중에 할당
		
		  System.out.println (a) ;
          // System.out.println (b); // 오류발생 : 변수 선언후 값이 할당이 안되어 있어 
        
		  //2. 변수선언과 동시에 값을 할당 .
		   int c =10;
		   int d =20;
		    System.out.print(c);   //10 
		    System.out.print(d);   //20 
		  // 리터럴 :변수 ,상수에 들어가는 값 
		    
		    //변수에 새로운 값을 할당 
		    c = 55;
		    d = 66; 
		    
		  System.out.println(c); // 55
		  System.out.println(d);  // 66
		  
		  //변수는 새로운값을 계속 넣을수있다
		  //상수 :한번 값이 할당되면 다른값을 넣을수 없다 . final 키를 넣어서 상수 선언 
		  // 상수 명은 대문자로 할당 .
		  
		  final int ABC =200 ;
         final double PI = 3.14 ;
		  
		  System.out.println(ABC);
		  System.out.println(PI);
		  
		  //		  ABC = 300; //상수는 새로운 값을 넣으면 오류 발생 
		  
		  System.out.println("=================8가지 자료형 ==================");
		  
		  // 기본 자료형 8가지 
		  boolean abc ;  // true, false 값만 넣을 수 있다 .
		  abc= true ;
		  
		  System.out.println(abc) ; //true
		  
		  //2. 정수 값을 넣을수 있는 자료형 ( byte :1byte ,short :2byte , int : 4byte , long : 8byte.)
		  // byte : 1byte  (8bit ) : -128 ~127 
		  
	       byte aa ;
	       aa = -127 ;
	       byte bb ;
	       bb = 127;
	       
	       System.out.println(aa);
           System.out.println(bb);
           
           //short : 2byte (16bit ) : -32768 ~32767 
           
           short cc ;
           short dd ;
           cc= -32768;
           dd= 32767 ;
           System.out.println(cc);
           System.out.println(dd);
           
           //int  : 4byte (64 bit ) : -2.147.483.648 ~ 2.147.483.647   <==정수 기ㅣ본 
           
           int ee ;   
            int ff ;
            ee= -2147483648  ;             //_는 구분자로 생략
            ff= 2147483647 ;
            System.out.println(ee);
            System.out.println(ff);
            
            	
            // long : 8byte  (64bit )  : -9223372036854775808 ~ 9223372036854775807
            // 64bit : 처음 비트 (MSB , 부호를 처리하는 비트  ) 
            // clac : 
             // 리터롭에 소문자 l 이나 대문자 L 을 명시 하여야한다 .
            
            long gg ;
            long hh ;
            //정수의 범위를 벗어난 값을 넣을때 : L 을 끝에넣고 
            
             gg = -9223372036854775808L ;  //히터럴에 L을 적용 
             hh = 9223372036854775807L ;
             
            System.out.println(gg);
            System.out.println(hh);
            
            long ii ;
            ii = 5000 ; //int 범위 내의 값을 얹을때 L을 명시하지않아도됨 
            
            //실수 : float ,double  <=== 더블이 ( 기본)
             // float : 4byte (32bit  ) 소숫점 7자리까지 정밀도가 유지됨 . 리터럴 뒤에 f , F
            float jj ;
            jj =3.148888888888888F ; // 리터럴 무
            		System.out.println(jj);
            		
            		
            /// double :8byte (64bit ) ,소숫점 15 자리까지 정밀도 유지됨 <== 기본형
             double kk;
             kk = 3.14888888888888888888;
  
           System.out.println(kk);
           
           System.out.println("-===================================");
           
            //char  :  한글자 1문자를 넣을 수있음 ,(영문 ,한글,일본어 ,중국어 , string : 문자열 , "" ) 
          /* 
           *  -1문자  ,한단어  
           *  -char 의 값 (리터럴 ) 을 넣을 떄는 ''
           -아스키 코드표에 값 (10진수 ),유니코드로 할당 (16진수 ) 
           *  -문자 , 아스키 코드 값  (10진수 ) , 유니코드 로 할당 (16진수)               
           아스키코드 : 7bit , 영어 대문자 ,영어소문자 ,숫자 ,특수문자
           - 유니코드 : 2bit 
           */ 
           
           char ll; 
           ll  = 'A'; 
           char mm;
           mm= '가';
           System.out.println(ll);
           System.out.println(mm);
           System.out.println("==============================");
           
           //문자로 값넣기  : a 
           char nn = 'a';
           System.out.println(nn);
           
           // 10진수 아스키 코드 값으로 값넣기    :a
            // '' 넣으면 오류 
           
           char oo= 97;
           System.out.println(oo);
           
           
           // 16진수 유니코드 값으로 값넣기  : a 
           char pp= '\u0061';
           System.out.println(pp);
           
           System.out.println("=============================");
           
           char firstName2 ='\uae30' ; // 이름 두번째
           char firstName1 ='\uc644' ; // 이름 첫번쨰 
           char lastName  = '\ua00d' ;//성 

           
         
     
           
           // 출력 내용 : 나의 이름은 지 완기 입니다 . 
           // println () : 출력 
           // printf () : 출력    
           
            		 
            		 
             
            		
	        
            
	       
	       
	       
	       
	         
		  
		  
		 
	}
}