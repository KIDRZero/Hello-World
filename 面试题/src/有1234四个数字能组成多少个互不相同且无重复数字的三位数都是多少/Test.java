package ��1234�ĸ���������ɶ��ٸ�������ͬ�����ظ����ֵ���λ�����Ƕ���;

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
		System.out.println("����Ϊ:"+count);
	}
}
