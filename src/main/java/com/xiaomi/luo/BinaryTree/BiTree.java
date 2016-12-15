package com.xiaomi.luo.BinaryTree;

import java.util.Stack;

import org.junit.Test;

public class BiTree {
	private BiTreeNode root;
	
	//构造一颗空树
	public BiTree() 
	{
		this.root = null;
	}
	
	//构造一颗根结点为root的树
	public BiTree(BiTreeNode root) {
		this.root = root;

	}
	
	//先根遍历（递归）
	public void preRootTraverse(BiTreeNode T){
		if(T != null){
			System.out.print(T.getData());
			preRootTraverse(T.getLchird());
			preRootTraverse(T.getRchild());
		}
	}
	
	//中根遍历（递归）
	public void midRootTraverse(BiTreeNode T){
		if(T != null){
			midRootTraverse(T.getLchird());
			System.out.print(T.getData());
			midRootTraverse(T.getRchild());
		}
	}
	
	//后根遍历（递归）
	public void postRootTraverse(BiTreeNode T){
		if(T != null){
			postRootTraverse(T.getLchird());
			postRootTraverse(T.getRchild());
			System.out.print(T.getData());
		}
	}
	
	//先根遍历(非递归)
	public void preRootTraverse2(BiTreeNode T){
		if(T!=null){
			Stack<BiTreeNode> S = new Stack<BiTreeNode>();
			S.push(T);
			while (!S.isEmpty()) {
				T = S.pop();
				System.out.print(T.getData());
				while (T!=null) {
					if(T.getLchird()!=null)
						System.out.print(T.getLchird().getData());
					if(T.getRchild()!=null)
						S.push(T.getRchild());
					T = T.getLchird();
				}
			}
		}
	}
	
	//中根遍历(非递归)
	public void midRootTraverse2(BiTreeNode T){
		if(T!=null){
			Stack<BiTreeNode> S = new Stack<BiTreeNode>();
			S.push(T);
			while(!S.isEmpty()){
				while (S.peek()!=null) {
					S.push(S.peek().getLchird());
				}
				S.pop();
				if(!S.isEmpty()){
					T = S.pop();
					System.out.print(T.getData());
					S.push(T.getRchild());
				}
			}
		}
	}
	
	//后根遍历(非递归)   p指向当前遍历中最后一个结点    flag标记当前栈顶结点是否被访问
	public void postRootTraverse2(BiTreeNode T){
		if(T!=null){
			Stack<BiTreeNode> S = new Stack<BiTreeNode>();
			S.push(T);
			BiTreeNode p = null;
			Boolean flag;
			while(!S.isEmpty()){
				while(S.peek()!=null){
					S.push(S.peek().getLchird());
				}
				S.pop();
				while(!S.isEmpty()){
					T = S.pop();
					if(T.getRchild()==null||T.getRchild()==p){
						System.out.print(T.getData());
						p = T;
						flag = true;
					}
					else{
						S.push(T.getRchild());
						flag = false;
					}
					if(!flag){
						break;
					}
				}
			}
		}
	}
	
	@Test
	public void test(){
		BiTreeNode rootNode = new BiTreeNode("A");
		BiTreeNode subFourLeftNode = new BiTreeNode("D");
		BiTreeNode subThreeLeftNode = new BiTreeNode("C", subFourLeftNode, null);
		BiTreeNode subSecondLeftNode = new BiTreeNode("B", null, subThreeLeftNode);
		BiTreeNode subFiveRightNode1 = new BiTreeNode("H");
		BiTreeNode subFiveRightNode2 = new BiTreeNode("K");
		BiTreeNode subFourthRightNode = new BiTreeNode("G",subFiveRightNode1,subFiveRightNode2);
		BiTreeNode subThridRightNode = new BiTreeNode("F",subFourthRightNode,null);
		BiTreeNode subSecondRightNode = new BiTreeNode("E",null,subThridRightNode);
		rootNode.setLchird(subSecondLeftNode);
		rootNode.setRchild(subSecondRightNode);
		preRootTraverse(rootNode);
		System.out.println("");
		midRootTraverse(rootNode);
		System.out.println("");
		postRootTraverse(rootNode);
		System.out.println("");
		preRootTraverse2(rootNode);
		System.out.println("");
		midRootTraverse2(rootNode);
	}
}
