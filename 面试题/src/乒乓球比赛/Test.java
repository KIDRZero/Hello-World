package ƹ�������;
/*
 * ����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
 * �ѳ�ǩ��������������
 * �������Ա����������������a˵������x�ȣ�
 * c˵������x,z�ȣ��������ҳ��������ֵ�����
 * cz   ay bx
 */
public class Test {
    public static void main(String[] args) {
		char[] c1={'a','b','c'};
		char[] c2={'x','y','z'};
		  for(int i=0;i<c1.length;i++){
			  for(int k=0;k<c2.length;k++){
				  if((c1[i]=='a' && c2[k]=='y') ||(c1[i]=='a' && c2[k]=='x')){
					  continue;
				  }else if((c1[i]=='c' && c2[k]=='x') ||(c1[i]=='c' && c2[k]=='z')){
					  continue;
				  }else if((c1[i]=='b' && c2[k]=='y') ||(c1[i]=='b' && c2[k]=='z')){
					  continue;
				  }else
				  System.out.println(c1[i]+"vs"+c2[k]);
			  }
			 
		  }
		 
	}
}
