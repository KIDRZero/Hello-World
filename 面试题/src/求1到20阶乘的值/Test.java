package ��1��20�׳˵�ֵ;
//��һ��flagֵ����ÿ�εĽ׳�ֵ��Ȼ��sum����ͳ�ƺ�
public class Test {
    public static void main(String[] args) {
		long sum=0;
		long flag=1;
		for(int i=1;i<=20;i++){
			flag*=i;
			sum+=flag;
			System.out.println(flag);
		}
		System.out.println("1��20�Ľ׳�ֵ��:"+sum);
	}
}
