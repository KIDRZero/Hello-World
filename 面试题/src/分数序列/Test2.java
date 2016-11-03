package ·ÖÊıĞòÁĞ;

public class Test2 {
   public static void main(String[] args) {
	  int x=2;
	  int y=1;
	  int t=0;
	  double sum=0;
	  for(int i=1;i<=20;i++){
		  sum+=(double)x/y;
		  t=y;
		  y=x;
		  x=t+y;
	  }
	  System.out.println(sum);
}
}
