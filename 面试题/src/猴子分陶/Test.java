package ���ӷ���;

public class Test {
    public static void main(String[] args) {
    	//�������һ��ʣ��4����Ȼ�������жϣ���֮���һ��ʣ�µ���4�ı���
    	int j=0;
    	int count;
    	int w=0;
		for(int i=4;i<10000;i+=4){
			count=0;
			    w=i;
			for(int k=0;k<5;k++){
				j=i/4*5+1;//ͨ����һ�������j��������һ����i����4�ı���
				i=j;
				if(j%4==0)
					count++;
				else
					break;//�����ڲ�ѭ�����ⲿ��4�ٴν����ж�
				
				
			}
			    i=w;//����������������ܱ�����������ô�ͱ�ʾ4������Ҫ�󣬰�֮ǰ����w��i�ĵ�һ��ֵ�ٸ�w���������ѭ������i+4����8���ж�
			if(count==4){
				System.out.println(j);
				break;
			}
			
		}
		
	}
}
