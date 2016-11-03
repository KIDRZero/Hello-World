package 组合模式;

import java.util.Enumeration;
import java.util.Vector;
/*
 * 一个结点可以有父节点也可以有子节点
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
   //添加子节点
   public void add(TreeNode node){
	   children.add(node);
   }
   //删除子节点
   public void reomve(TreeNode node){
	   children.remove(node);
   }
   //获取所有孩子结点
   public Enumeration<TreeNode> getChidren(){
	   return children.elements();
   }
}
