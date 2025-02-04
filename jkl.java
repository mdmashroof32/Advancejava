package javaframwork;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;



public class jkl {
	
	public static void list() {
		List <Integer> list = new ArrayList<>();
		list.add(80);
		list.add(50);
		list.add(90);
		list.add(80);
		list.add(34);
		list.add(65);
		list.add(59);
		list.add(95);
		list.add(57);
		list.forEach(Nums -> System.out.print(Nums + " "));
		
		System.out.println( ); // print the other method from next line
	
	}
	
	public static void set(){
		Set <Integer> set = new HashSet<>();
		set.add(89);
		set.add(89);
		set.add(32);
		set.add(36);
		set.forEach(Nums -> System.out.print(Nums + " "));
		
		
	}
	

	public static void main(String[] args) {
	list();	
	set();
	
}
}
