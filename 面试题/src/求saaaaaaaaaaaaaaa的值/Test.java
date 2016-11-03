package 求saaaaaaaaaaaaaaa的值;

import java.util.Scanner;

/*
 * 求s=a+aa+aaa+aaaa+aa...a的值
 * ，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制
 */
public class Test {
   public static void main(String[] args) {
	  long a=0;
	  long b=0;
	  long sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请输入数a");
	  a=sc.nextInt();
	  System.out.println("请输入项数n");
	  int n=sc.nextInt();
	  //a的值每次变化为2 20 200 2000
	  //b的值每次变化为2,22,222,2222，用a来接受增量，用b接受每次变化后的新值
	  for(int i=0;i<n;i++){
		  b=b+a;
		  sum+=b;
		  a=a*10;
	  }
	  System.out.println(sum);
}
}
