package �̳�ʱ���ִ��˳��;
/*
 * ����̳и��࣬����������󣬻��ȵ��ø��๹�췽������������๹�췽��
 */
public class ChildrenClass extends FatherClass{
    public ChildrenClass(){
    	System.out.println("���౻����");
    }
    
    public static void main(String[] args) {
		FatherClass f1=new FatherClass();
		ChildrenClass c1=new ChildrenClass();
		FatherClass f2=new ChildrenClass();
	}
}
