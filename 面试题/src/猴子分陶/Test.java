package 猴子分陶;

public class Test {
    public static void main(String[] args) {
    	//假设最后一次剩下4个，然后依次判断，总之最后一次剩下的是4的倍数
    	int j=0;
    	int count;
    	int w=0;
		for(int i=4;i<10000;i+=4){
			count=0;
			    w=i;
			for(int k=0;k<5;k++){
				j=i/4*5+1;//通过这一步算出的j，又是上一步的i，是4的倍数
				i=j;
				if(j%4==0)
					count++;
				else
					break;//跳出内部循环，外部加4再次进行判断
				
				
			}
			    i=w;//如果不成立，即不能被四整除，那么就表示4不符合要求，把之前交给w的i的第一次值再给w，进行外层循环，由i+4等于8来判断
			if(count==4){
				System.out.println(j);
				break;
			}
			
		}
		
	}
}
