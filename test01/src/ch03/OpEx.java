package ch03;

public class OpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		double num2=3.0;
		int result=num1++;// num1=num1+1,num1=num1-1
		
		num1+=5;
		System.out.println(num1);
		num1-=5;
		System.out.println(num1);
		num1*=5;
		System.out.println(num1);
		num1/=5;
		System.out.println(num1);
		num1%=7;
		System.out.println(num1);
		
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1);
		System.out.println(result);
		
		
//		System.out.println(num1+num2);
//		System.out.println(num1-num2);
//		System.out.println(num1*num2);
//		System.out.println(num1/num2);
//		System.out.println(num1%num2);
	}
}
