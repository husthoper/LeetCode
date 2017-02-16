package com.xiaomi.luo.Algorithm;

public class Sort {
	
	//选择排序
	public static void selectSort(int[] a){
		if(a!=null){
			for (int i = 0; i < a.length; i++) {
				int temp = a[i]; int flag = i;
				for (int j = i+1; j < a.length; j++) {
					if(temp>a[j]){
						temp = a[j];
						flag = j;
					}
				}
				if(flag!=i){
					a[flag] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//插入排序
	public static void insertSort(int[] a){
		if(a!=null){
			for (int i = 1; i < a.length; i++) {
				int temp = a[i]; int j = i;
				if(a[j-1]>temp){
					while (j>=1&&a[j-1]>temp) {
						a[j]=a[j-1];
						j--;
					}
				}
				a[j] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//冒泡排序
	public static void BubbleSort(int[] a){
		//此循环确保已经遍历过的部分数组已经排序好
		for (int i = 0; i < a.length-1; i++) {
			//此循环表示从数组最后开始遍历，确保依次找到最小的数排到首位
			for (int j = a.length-1; j > i; j--) {
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//希尔排序(插入排序的升级)
	public static void shellSort(int[] a){
		int length  = a.length;
		int i,j;
		int d;
		int temp;
		for (d = length/2;d >0;d = d/2) {
			for(i=d;i<length;i++){
				j = i; temp = a[i];
				if(a[j-d]>temp){
					while(j>=d&&a[j-d]>temp){
						a[j] = a[j-d];
						j -= d;
					}
				}
				a[j] = temp;
			}
		}
	}
	
	//归并排序
	public static void MergeSort(int[] a,int p,int r){
		if(p<r){
			int q = (p + r)/2;
			MergeSort(a,p,q);
			MergeSort(a, q+1, r);
			Merge(a, p, q, r);
		}
	}
	public static void Merge(int[] a,int p,int q,int r){
		int i,j,k,n1,n2;
		n1 = q-p+1;
		 n2 = r-q;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for (i = 0,k = p; i<n1; i++,k++) {
			L[i] = a[k];
		}
		for (j = 0,k = q+1; j<n2; j++,k++) {
			R[j] = a[k];
		}
		for (i=0,j=0,k=p;i<n1&j<n2;k++) {
			if(L[i]<R[j]){
				a[k] = L[i];
				i++;
			}
			else{
				a[k] = R[j];
				j++;
			}
		}
		if(i<n1){
			for (j=i; j<n1; j++,k++) {
				a[k] = L[j];
			}
		}
		if(j<n2){
			for (i=j; i<n2; i++,k++) {
				a[k] = R[i];
			}
		}
	}
	
	//快速排序
	public static void sort(int[] a,int low,int high){
		int i,j;
		int index;
		i = low;
		j = high;
		if(low<high){
			index = a[i];
			while(i<j){
				while (i<j&&a[j]>index) {
					j--;
				}
				if(i<j){
					a[i++] = a[j];
				}
				while (i<j&&a[i]<index) {
					i++;
				}
				if(i<j){
					a[j--] = a[i];
				}
			}
			a[i] = index;
			sort(a, low, i-1);
			sort(a, i+1, high);
		}
	}
	public static void quickSort(int[] a){
		sort(a, 0, a.length-1);
	}
	
	
	public static void main(String[] args) {
		int[] a = {38,65,97,76,13,27,49};
//		insertSort(a);
//		System.out.println();
//		selectSort(a);
//		System.out.println();
//		BubbleSort(a);
//		MergeSort(a, 0, a.length-1);
//		quickSort(a);
		shellSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
