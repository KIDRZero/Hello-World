package 有1234四个数字能组成多少个互不相同且无重复数字的三位数都是多少;

public class Test {
     public static void main(String[] args) {
    	 int count=0;
		for(int x=1;x<5;x++){
			for(int y=1;y<5;y++){
				for(int z=1;z<5;z++){
					if(x!=y && y!=z && x!=z){
						count++;
						System.out.print(x*100+y*10+z+" ");
					}
				}
			}
		}
		System.out.println("个数为:"+count);
	}
}
