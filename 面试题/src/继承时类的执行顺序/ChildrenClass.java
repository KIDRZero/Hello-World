package 继承时类的执行顺序;
/*
 * 子类继承父类，创建子类对象，会先调用父类构造方法，后调用子类构造方法
 */
public class ChildrenClass extends FatherClass{
    public ChildrenClass(){
    	System.out.println("子类被创建");
    }
    
    public static void main(String[] args) {
		FatherClass f1=new FatherClass();
		ChildrenClass c1=new ChildrenClass();
		FatherClass f2=new ChildrenClass();
	}
}
