package �ڲ����ʵ�ַ�ʽ;
/*
 * ��̬�ڲ�������о�̬��Ա�����Ǿ�̬�ڲ��������о�̬��Ա
 * ��̬�ڲ���ķǾ�̬��Ա���Է����ⲿ��ľ�̬�����������ɷ����ⲿ��ķǾ�̬����
 * �Ǿ�̬�ڲ���ķǾ�̬��Ա���Է����ⲿ��ķǾ�̬����
 */
public class OuterClass {
  private class InnerClass{
	  public InnerClass(){
		  System.out.println("�ڲ��౻����");
	  }
  }
  public OuterClass(){
	  InnerClass ic=new InnerClass();
	  System.out.println("�ⲿ�౻����");
  }
  
  public static void main(String[] args) {
	  OuterClass oc=new OuterClass();
}
}
