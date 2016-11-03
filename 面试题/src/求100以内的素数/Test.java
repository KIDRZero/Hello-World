package 求100以内的素数;

public class Test {
    public static void main(String[] args) {
		boolean b=false;
		System.out.println(2+" "+3);
		for(int i=3;i<100;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					b=false;
					break;//如果能被开方的值到2的任意一个值整除，那么就不是素数
				}else{
					b=true;
				}
			}
			if(b==true){
				System.out.println(i);
			}
		}
	}
}
