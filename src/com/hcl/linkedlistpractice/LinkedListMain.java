package com.hcl.linkedlistpractice;
import java.util.*;
public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Whenever you can, use this concrete class --> List<String> = new LinkedList<String>()
		//We don't use it because we are specifically using LinkedList specific functions but if its basic list add get then use above!
		LinkedList<String> pizza = new LinkedList<String>();
        pizza.add("Cheese Pizza");
        pizza.add("Mushroom Pizza");
        pizza.add("Hamburger Pizza");
        pizza.add("Pineapple Pizza");
        pizza.add("Veggie Pizza");
        // Below, if you are using .getLast() or .getFirst() then you have to have LinkedList<> initialized instead of List
        System.out.println(pizza.getLast());
        
        // Use getFirst() to display the first item in the list
        System.out.println(pizza.getFirst());
	}

}
