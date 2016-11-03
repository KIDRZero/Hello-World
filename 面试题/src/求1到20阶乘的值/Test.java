package 求1到20阶乘的值;
//用一个flag值保存每次的阶乘值，然后sum用来统计和
public class Test {
    public static void main(String[] args) {
		long sum=0;
		long flag=1;
		for(int i=1;i<=20;i++){
			flag*=i;
			sum+=flag;
			System.out.println(flag);
		}
		System.out.println("1到20的阶乘值是:"+sum);
	}
}
