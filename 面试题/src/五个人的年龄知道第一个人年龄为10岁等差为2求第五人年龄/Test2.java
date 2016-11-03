package 五个人的年龄知道第一个人年龄为10岁等差为2求第五人年龄;

public class Test2 {
   public static void main(String[] args) {
	int age=getNum(5);
	System.out.println("第五个人年龄为:"+age);
}
   public static int getNum(int i){
	   if(i==1){
		   return 10;
	   }else{
		   return 2+getNum(i-1);
	   }
   }
}
