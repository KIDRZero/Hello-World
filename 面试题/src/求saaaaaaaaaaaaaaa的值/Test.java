package ��saaaaaaaaaaaaaaa��ֵ;

import java.util.Scanner;

/*
 * ��s=a+aa+aaa+aaaa+aa...a��ֵ
 * ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)��
 * ����������м��̿���
 */
public class Test {
   public static void main(String[] args) {
	  long a=0;
	  long b=0;
	  long sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("��������a");
	  a=sc.nextInt();
	  System.out.println("����������n");
	  int n=sc.nextInt();
	  //a��ֵÿ�α仯Ϊ2 20 200 2000
	  //b��ֵÿ�α仯Ϊ2,22,222,2222����a��������������b����ÿ�α仯�����ֵ
	  for(int i=0;i<n;i++){
		  b=b+a;
		  sum+=b;
		  a=a*10;
	  }
	  System.out.println(sum);
}
}
