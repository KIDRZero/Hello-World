package ����˵�����֪����һ��������Ϊ10��Ȳ�Ϊ2�����������;

public class Test2 {
   public static void main(String[] args) {
	int age=getNum(5);
	System.out.println("�����������Ϊ:"+age);
}
   public static int getNum(int i){
	   if(i==1){
		   return 10;
	   }else{
		   return 2+getNum(i-1);
	   }
   }
}
