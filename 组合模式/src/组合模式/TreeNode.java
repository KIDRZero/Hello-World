package ���ģʽ;

import java.util.Enumeration;
import java.util.Vector;
/*
 * һ���������и��ڵ�Ҳ�������ӽڵ�
 */
public class TreeNode {
   private String name;
   private TreeNode parent;
   private Vector<TreeNode> children=new Vector<TreeNode>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public TreeNode getParent() {
	return parent;
}
public void setParent(TreeNode parent) {
	this.parent = parent;
}
public TreeNode(String name) {
	super();
	this.name = name;
}
   //����ӽڵ�
   public void add(TreeNode node){
	   children.add(node);
   }
   //ɾ���ӽڵ�
   public void reomve(TreeNode node){
	   children.remove(node);
   }
   //��ȡ���к��ӽ��
   public Enumeration<TreeNode> getChidren(){
	   return children.elements();
   }
}
