package һ������������100����һ����ȫƽ�����ټ���168����һ����ȫƽ�������ʸ����Ƕ���;

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
