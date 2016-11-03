package 五个人的年龄知道第一个人年龄为10岁等差为2求第五人年龄;

public class Test {
    public static void main(String[] args) {
    	int age=10;
		for(int i=2;i<=5;i++){
			age+=2;
		}
		System.out.println("第五个人的年龄为:"+age);
	}
} 
