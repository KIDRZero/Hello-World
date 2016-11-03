package 利用递归方法求5的阶乘;

public class Test {
	  public static void main(String[] args) {
		  long a=getNum(5);
		  System.out.println("5的阶乘为:"+a);
	}
     public static long getNum(int i){
    	 if(i==1){
    		 return 1;
    	 }else{
    		 return i*getNum(i-1);
    	 }
     }
}
