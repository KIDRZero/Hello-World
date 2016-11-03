package 乒乓球比赛;
/*
 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
 * 已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a说他不和x比，
 * c说他不和x,z比，请编程序找出三队赛手的名单
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
