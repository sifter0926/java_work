package ch04;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("서로 다른 세개의 숫자를 입력하세요");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("가장 큰수는 "+n1+"입니다");
			}else {
				System.out.println("가장 큰수는 "+n3+"입니다");
			}
		}else {
			if(n2>n3) {
				System.out.println("가장 큰수는 "+n2+"입니다");
			}else {
				System.out.println("가장 큰수는 "+n3+"입니다");
			}
		}
	}

}
