package ������������xyz�������������С�������;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		for(int i=1;i<=3;i++){
			System.out.println("�������"+i+"������");
			a[i-1]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++){
			for(int k=0;k<a.length-1-i;k++){
				if(a[k]>a[k+1]){
					int temp=a[k+1];
					    a[k+1]=a[k];
					    a[k]=temp;
				}
			}
		}
		for(int w=0;w<a.length;w++){
			System.out.print(a[w]+" ");
		}
	}
}
