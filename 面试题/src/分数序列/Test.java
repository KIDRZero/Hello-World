package ��������;
/*
 * һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮��
 */
public class Test {
    public static void main(String[] args) {
		int a=1;
		int b=2;
		double sum=0;
		for(int i=1;i<=20;i++){
			sum+=(double)b/a;
		    b=a+b;
			a=b-a;//a+b��ֵ��Ϊ�µķ�ĸ��ԭ����bֵ��Ϊ����
			
//			int t=b;
//			b=b+a;
//			a=t;
		}
		System.out.println(sum);
	}
}
