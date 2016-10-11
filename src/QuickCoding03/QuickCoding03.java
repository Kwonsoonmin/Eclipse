package QuickCoding03;

import java.util.*;

class MyException extends Exception {
	public MyException(String m){ // MyException01 생성자.
		super(m);
	}
}

public class QuickCoding03 {
	
	public static void CheckPositionalNumber(int num1, int num2) throws MyException{
		String s_1 = String.valueOf(num1);
		String s_2 = String.valueOf(num2);
		
		if(s_1.length() > 2 || s_2.length() > 2){
			throw(new MyException("예외: 3자릿수 이상의 숫자는 안됩니다."));
			// 입력된 숫자의 자릿수가 3자리를 넘어가는 경우
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b;
		int a_int, b_int = 0;
		int dividing = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("두 개의 숫자를 입력하세요.");
		
		try{
			a = scan.next();
			b = scan.next();
		
			a_int = Integer.parseInt(a);
			b_int = Integer.parseInt(b);
			
			CheckPositionalNumber(a_int, b_int);
			
			dividing = divide(a_int,b_int);
			
			System.out.println("결과: "+ dividing);
			
		}catch(ArithmeticException e){
			System.out.println("예외: 0으로 나눗셈을 하였습니다."); // 0으로 나눗셈 하는 경우
		}catch(NumberFormatException ne){
			System.out.println("예외: 입력받은 문자열이 숫자가 아닙니다."); // 입력받은 문자열이 숫자가 아닌 경우
		}catch(MyException me){
			me.printStackTrace();
		}
	}
	
	public static int divide(int i, int j){
		int result = 0;
		result = i / j;
		
		return result;
	}
}
