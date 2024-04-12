package com.java.collection.arraylist;
import java.util.ArrayList;
import java.util.List;
/*  
 *  Replacing all the elements of the ArrayList
	A new method, replaceAll(UnaryOperator<E> operator), was added in Java 8. 
	This method takes a single UnaryOperator type argument. The UnaryOperator interface is a
	functional interface that has a single abstract method, apply(), 
	that returns a result of the same object type as the operand.

	Let’s say we have an ArrayList that contains String objects; we need to make all the elements in this list uppercase. 
	In this case, we can use the replaceAll() method and provide it with a lambda expression that converts each element into uppercase.
 * 
 * */
public class ArrayListDemo2 {

	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");

		list.replaceAll((element) -> element.toUpperCase());

		System.out.println(list);
	}
}