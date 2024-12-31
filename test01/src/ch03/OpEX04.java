package ch03;

import java.util.Scanner;

public class OpEX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		int score1=sc.nextInt();
		int score2=sc.nextInt();
		
		char result=((score1+score2)/2>=70)?'T':'F';
		String result1=((score1+score2)/2>=70)?"합격":"불학격";
		System.out.println(result1);
		sc.close();
	}
}
