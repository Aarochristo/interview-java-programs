package com.javapart1;

import java.util.HashMap;

import org.testng.annotations.Test;

public class RemoveSpacesinString {

	@Test

	void removespace()

	{
		String spacedsentence = "ilove    my c   ountry";

		char cha[] = spacedsentence.toCharArray();

		StringBuffer cl = new StringBuffer();

		for (int i = 0; i < cha.length; i++) {
			if ((cha[i] != ' ') && (cha[i] != '\t')) {

				cl.append(cha[i]);
			}
		}

		System.out.println(cl);

	}
	@Test

	void countnumberofstring()
	{
	
	String sentence = "my name is aaron";
	 
	  String alp[] = sentence.split(" ");
	  
	  HashMap<String, Integer> map = new HashMap<String, Integer>();
	  
	  for (String run : alp) 
	  {
	  
	  if (map.containsKey(run))
	 
	  { 
	  map.put(run, map.get(run) + 1);
	  
	  }
	  else
	  
	  
	   { 
	       
	       map.put(run, 1);
	  
	  }
	  }
	  
	     System.out.println(map);  
	  }
	  
	    
	

}
