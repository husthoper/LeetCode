package com.xiaomi.luo.Graph;

import java.util.Iterator;

public interface VertexInterface<T> {
	public T getLabel();
	public void visit();		//标记该顶点为已访问
	public void unVisit();
	public boolean isVisited();
	public boolean connect(VertexInterface<T> endVertex,double edgeWeight);
	public boolean connect(VertexInterface<T> endVertex); //无权边连接
	public Iterator<VertexInterface<T>> getNeighborIterator();
//	...
}
