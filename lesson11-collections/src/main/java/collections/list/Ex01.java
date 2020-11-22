package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 
{
    public static void main( String[] args ){
    	//prior version 1.4
    	//raw type: each element is an 
    	///object as default
    	//object a = new  []object[0]; 
    	List a = new ArrayList();
    	List b = new LinkedList();
    	
    	a.add(1);
    	a.add("welcome");
    	a.add(2.f);
    	
    	
        System.out.println( "a: " + a);
        System.out.println( "b: " + b);
        for (Object item: a) {
        	System.out.println(Integer.parseInt(item.toString()));
        }
        
    }
}
