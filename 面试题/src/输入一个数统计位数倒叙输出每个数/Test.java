package ����һ����ͳ��λ���������ÿ����;

import java.util.Scanner;

//��һ��������5λ����������
//Ҫ��һ�������Ǽ�λ�������������ӡ����λ����
//charAt��ʼλ���Ǵ�0��ʼ�������������һ��λ�ã��ǳ���-1
//����һ������������ת��Ϊ�ַ���
public class Test {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������5λ������");
		int a=sc.nextInt();
		String s=Integer.toString(a);
		System.out.println("���������һ��:"+s.length()+"λ��");
		for(int i=s.length();i>0;i--){
			System.out.print(s.charAt(i-1)+" ");
		}
	}
}
