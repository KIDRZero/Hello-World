package 输入一行字符统计其中英文字母空格数字和其它字符的个数;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("请随便输入一点东西,按回车结束");
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
		System.out.println("英文字母的个数为:"+a+"数字的个数"+b+"空格个数为:"+c+"其他字符个数:"+d);
}
}
