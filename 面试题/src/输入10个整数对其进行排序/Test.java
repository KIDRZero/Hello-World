package 输入10个整数对其进行排序;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int[]arr=new int[10];
		System.out.println("请输入10个整数");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		getNum(arr);
	}
    public static void getNum(int[]a){
    	for(int i=0;i<a.length-1;i++){
    		for(int j=0;j<a.length-1-i;j++){
    			if(a[j]>a[j+1]){
    				int t=a[j];
    				a[j]=a[j+1];
    				a[j+1]=t;
    			}
    		}
    	}
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    	}
    }
}
