package com.xiaomi.luo.Algorithm;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ArrayDictionary<K,V> implements Map<K,V>,Serializable
{
	private	Entry<K,V>[] dictionary;	//无序元素的数组
	private int currentSize;			//元素的数量
	private final static int DEFAULT_CAPACITY = 25;
	
	public ArrayDictionary()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayDictionary(int defaultCapacity) {
		dictionary = new Entry[defaultCapacity];
		currentSize = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public V put(K key, V value) {
		return null;
	}

	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class Entry<S,T> implements Serializable
	{
		private S key;
		private T value;
		public Entry(S searchKey,T dataValue) {
			key = searchKey;
			value = dataValue;
		}
		private S getKey(){
			return key;
		}
		private T getValue(){
			return value;
		}
		private void setValue(T newValue){
			value = newValue;
		}
	} 
}
