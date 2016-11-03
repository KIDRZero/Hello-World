package 内部类的实现方式;
/*
 * 静态内部类可以有静态成员，而非静态内部类则不能有静态成员
 * 静态内部类的非静态成员可以访问外部类的静态变量，而不可访问外部类的非静态变量
 * 非静态内部类的非静态成员可以访问外部类的非静态变量
 */
public class OuterClass {
  private class InnerClass{
	  public InnerClass(){
		  System.out.println("内部类被创建");
	  }
  }
  public OuterClass(){
	  InnerClass ic=new InnerClass();
	  System.out.println("外部类被创建");
  }
  
  public static void main(String[] args) {
	  OuterClass oc=new OuterClass();
}
}
