package com.luo.LeetCode;

import java.util.LinkedList;
import java.util.Queue;
/**
 * target: 513:find bottom left tree value
 * @author lrb
 * use queue to solve the problem
 */
public class BottomLeftValue {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	public int findBottleLeftValue(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		int result = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			result = q.peek().val;
			while (size>0) {
				TreeNode tempNode = q.poll();
				size--;
				if(tempNode.left!=null){
					q.offer(tempNode.left);
				}
				if(tempNode.right!=null){
					q.offer(tempNode.right);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("a");
		q.add("b");
		q.add("c");
		String headstr = q.peek();
		System.out.println(headstr);
	}
}
