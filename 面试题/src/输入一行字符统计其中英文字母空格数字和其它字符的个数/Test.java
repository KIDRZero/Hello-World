package ����һ���ַ�ͳ������Ӣ����ĸ�ո����ֺ������ַ��ĸ���;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("���������һ�㶫��,���س�����");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
				a++;
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9'){
				b++;
			}
			else if(s.charAt(i)==' '){
				c++;
			}else{
				d++;
			}
		}
		System.out.println("Ӣ����ĸ�ĸ���Ϊ:"+a+"���ֵĸ���"+b+"�ո����Ϊ:"+c+"�����ַ�����:"+d);
}
}
