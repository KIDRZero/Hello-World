package ����һ����λ���ж��ǲ��ǻ�����;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	int a=0;
		Scanner sc=new Scanner(System.in);
		do{
			 System.out.println("������һ����λ��");
			 a=sc.nextInt();
		}while(a<10000 ||a>99999);
		String s=String.valueOf(a);
		char[]ch=s.toCharArray();
		if(ch[0]==ch[4] && ch[1]==ch[3]){
			System.out.println("����һ��������");
		}else{
			System.out.println("�ⲻ��һ��������");
		}
	}
}
