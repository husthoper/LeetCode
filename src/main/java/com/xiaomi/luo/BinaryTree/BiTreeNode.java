package com.xiaomi.luo.BinaryTree;

public class BiTreeNode {
	private Object data;
	private BiTreeNode lchird;
	private BiTreeNode rchild;
	
	//构造一个空节点
	public BiTreeNode(){
		this(null);
	}
	
	//构造一个左,右孩子域为空的结点
	public BiTreeNode(Object data){
		this(data,null,null);
	}
	
	public BiTreeNode(Object data,BiTreeNode lchird,BiTreeNode rchild){
		this.data = data;
		this.lchird = lchird;
		this.rchild = rchild;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public BiTreeNode getLchird() {
		return lchird;
	}

	public void setLchird(BiTreeNode lchird) {
		this.lchird = lchird;
	}

	public BiTreeNode getRchild() {
		return rchild;
	}

	public void setRchild(BiTreeNode rchild) {
		this.rchild = rchild;
	}
	
	
}
