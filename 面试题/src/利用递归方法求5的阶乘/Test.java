package ���õݹ鷽����5�Ľ׳�;

public class Test {
	  public static void main(String[] args) {
		  long a=getNum(5);
		  System.out.println("5�Ľ׳�Ϊ:"+a);
	}
     public static long getNum(int i){
    	 if(i==1){
    		 return 1;
    	 }else{
    		 return i*getNum(i-1);
    	 }
     }
}
