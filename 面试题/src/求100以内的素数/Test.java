package ��100���ڵ�����;

public class Test {
    public static void main(String[] args) {
		boolean b=false;
		System.out.println(2+" "+3);
		for(int i=3;i<100;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					b=false;
					break;//����ܱ�������ֵ��2������һ��ֵ��������ô�Ͳ�������
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
