package ����һ���ַ�ͳ������Ӣ����ĸ�ո����ֺ������ַ��ĸ���;
/*
 * next�������ܵõ����ո���ַ�����nextLine���������Ľ�����ֻ��Enter����
 * ��nextLine�����������ص���Enter��֮ǰ�������ַ������ǿ��Եõ����ո���ַ����ġ�
 */
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    	int a=0;
		int b=0;
		int c=0;
		int d=0;
		//System.out.println("���������һ�㶫��,���س�����");
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
		System.out.println("Ӣ����ĸ�ĸ���Ϊ:"+b+"���ֵĸ���"+a+"�ո����Ϊ:"+c+"�����ַ�����:"+d);
		getStr(s);
	}
   public static void getStr(String s){
	  String s1= new StringBuffer(s).reverse().toString();
	  System.out.println(s1);
   }
}
