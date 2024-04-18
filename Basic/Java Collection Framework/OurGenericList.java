package com.ridhi;
public class OurGenericList<T> implements Iterable<T>{
	public T[] items;
	public int size;

	public OurGenericList(){
		size = 0;
		items = new (T[])Object[100];
	}

	public void add(T item){
		items[size++] = item;
	}

	public T getItemByIndex(int index){
		return items[index];
	}

	@Override
	public Iterator<T> iterator(){

	}
}