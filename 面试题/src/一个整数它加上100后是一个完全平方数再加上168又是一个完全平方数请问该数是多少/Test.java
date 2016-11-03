package 一个整数它加上100后是一个完全平方数再加上168又是一个完全平方数请问该数是多少;

public class Test {
    public static void main(String[] args) {
		for(int i=1;i<10000000;i++){
			if(Math.sqrt(i+100)%1==0){
				if(Math.sqrt(i+268)%1==0){
					System.out.print(i+" ");
				}
			}
		}
	}
}
