package 输入一个数统计位数倒叙输出每个数;

import java.util.Scanner;

//给一个不多于5位的正整数，
//要求：一、求它是几位数，二、逆序打印出各位数字
//charAt起始位置是从0开始，所以这里最后一个位置，是长度-1
//输入一个整数，将其转化为字符串
public class Test {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个不多于5位的整数");
		int a=sc.nextInt();
		String s=Integer.toString(a);
		System.out.println("你输入的是一个:"+s.length()+"位数");
		for(int i=s.length();i>0;i--){
			System.out.print(s.charAt(i-1)+" ");
		}
	}
}
