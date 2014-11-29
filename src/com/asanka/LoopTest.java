/**
 * 
 */
package com.asanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Asanka Siriwardena
 *
 */
public class LoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		int[] arr = {4, 6, 7, 2, 13, 9, 5};
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}
//		
//	    System.out.println("done here!");

	    List<String> list = new ArrayList();
	    list.add("Mon");
	    list.add("Tue");
	    list.add("Wed");
	    list.add("Thu");
	    list.add("Fri");
	    list.add("Sat");
	    list.add("Sun");
	    
	    
	    System.out.println(list);
	    
	    int i = 0;
	    for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			
	    	   i++;
	    	   String entry = iterator.next();
	    	   if("Wed".equals(entry)){
	    		   iterator.remove();
	    		   
	    		   iterator.add("Nwed");
	    		   iterator.add("Poya");
	    		   iterator.add("Wed");
	    	   }
			
		}
	    
	    for (String string : list) {
			
	    	if("Wed".equals(string))
	    		list.remove(string);
		}
	    
	    System.out.println(list + " Executions: " + i);
	}

}
