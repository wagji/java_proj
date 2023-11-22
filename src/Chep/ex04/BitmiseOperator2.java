 package Chep.ex04;
       
 public class BitmiseOperator2 {
    	   
public static void main(String[] args) {
		   
// 바로 연산자자  : & AND = Or, ^JOR ~ m\n MaT
	////  & AnD 연산 : 0 & 0 , 0& 1 = 0, 1 & 0 , 1&1 =1 
 //(AND ) 연산 : 모든비트가 1일 때 결과 1 
		   
System.out.print(3& 10 ); // 2 
		
   //OR 연산 : 0 or 0 =0 or1 ,1=,2, 하나라도 1일들어가면 1 
      /* 10진수로   2진수 
         3 = 0011 
         10 = 1010
      AND =======================
      2     0010 =
		  System.out.println(3 * 10 );
 // 	 XOE =========================================
		    System.out.println(-10 ); //-11
	 논리 연산자 : 결과값으로 true /false 를 홀리턴 (돌려준다 ) < ==아주중요 
	   * && AND  : 모두 true 일때 true 
    && (AnD ) : true && true  => treue 
		-false  && false -> false 
	  false $&& false 
	 // ( OR ) : 논리연산 
	 하나라도 true 이면 true 
		true  || false = > true 
	 false  || false = > false 
	 //&& 연산 모두 true 일때 true . 
		   * ( XOR ) : 앞뒤가 같을때 false , 앞뒤가 값이 다를때 true 
		   *  true ' true => false 
		   *  true ' false => true 
		   *  false 'false => false 
		   *  false 'true => true 
		   *  NOT : true 일때 false , false 일때 true 
		     */
		  System.out.println(true && true );
		  System.out.println(true && true ); // trure 
		  System.out.println(true && false );  // false
		  System.out.println(true && true);
		  System.out.println(true && false  );  //false
		  System.out.println(true && true );
		
		  System.out.println("==================================");
		 
		  System.out.println(true || true ); //true
		  System.out.println(true || true ); //true
		  System.out.println(false  || true ); //true
		  System.out.println(true || false  ); //true
		  System.out.println(false || false  ); //false
		
            System.out.println("================================");	
            
            //'(XOR) 앞뒤가 같을때 False ,앞뒤의 값이 다를때 true 
            
            System.out.println( true ^ true );//false
            System.out.println( true ^ false );//true 
            System.out.println( false ^ true );//true
            System.out.println( false^ false  );//false

            System.out.println("=======================================");
            
  		  //   NOT : true 일때 false , false 일때 true 
            
             System.out.println(!true ); //false 
             System.out.println(!false  ); //true  
             
      // 논리연산자는 숏트 서 킷이 발생 될수 있음 . 쇼트 서킷을 방지하기 위해서 비트 연산자를 사용해서 방지할수있다 
       // 앞에 연산자로만 결과값을 유추할수 있는경우 뒤에있는 내용을 작동 시키지않고 결과값을 바로 처리한다 
         //AND 연산에서 앞에 false 가 작동하는경우 뒤에있는 내용을 확인하지 않는다 .
      // OR 연산에서 앞에 true 가 올경우 쇼트서킷이 발생됨 .
             
            
            
            
		
		

	}

}
