package ch03;

public class OpEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int num2=-8;
		
		int a=5;
		int b=4;
		
		System.out.println(a&=b);
		System.out.println(a|=b);
		System.out.println(a^=b);
		
		num<<=2;
		System.out.println(num);
		num>>=2;
		System.out.println(num);
		num2>>>=2;
		System.out.println(num2);

	}

}
