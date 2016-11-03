package 输入一行字符统计其中英文字母空格数字和其它字符的个数;
/*
 * next方法不能得到带空格的字符串而nextLine（）方法的结束符只是Enter键，
 * 即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
 */
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    	int a=0;
		int b=0;
		int c=0;
		int d=0;
		//System.out.println("请随便输入一点东西,按回车结束");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='0' && ch[i]<='9'){
				a++;
			}else if((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z'){
				b++;
			}else if(ch[i]==' '){
				c++;
			}else{
				d++;
			}
		}
		System.out.println("英文字母的个数为:"+b+"数字的个数"+a+"空格个数为:"+c+"其他字符个数:"+d);
		getStr(s);
	}
   public static void getStr(String s){
	  String s1= new StringBuffer(s).reverse().toString();
	  System.out.println(s1);
   }
}
