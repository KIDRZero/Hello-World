package 输入一个五位数判断是不是回文数;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	int a=0;
		Scanner sc=new Scanner(System.in);
		do{
			 System.out.println("请输入一个五位数");
			 a=sc.nextInt();
		}while(a<10000 ||a>99999);
		String s=String.valueOf(a);
		char[]ch=s.toCharArray();
		if(ch[0]==ch[4] && ch[1]==ch[3]){
			System.out.println("这是一个回文数");
		}else{
			System.out.println("这不是一个回文数");
		}
	}
}
