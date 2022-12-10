package com.javapart1;

import org.testng.annotations.Test;

public class Stringsprogram {

	
	  @Test(priority = 1)
	  
	  void stringbystringbuilder() { String
	  words="this is my first java proggram";
	  
	  
	  StringBuilder rev=new StringBuilder();
	  
	  rev.append(words);
	  
	  rev.reverse();
	  
	  System.out.println("by stringbuilder      ");
	  
	  System.out.print( rev);
	  
	  
	  
	  
	  }
	  
	  
	  @Test(priority = 2)
	  void stringbychar() {
	  
	  String word2="this is my second java program";
	  
	  
	  char arra[]=word2.toCharArray();
	  
	  
	  
	  for(int i=arra.length-1;i>=0;i--) {
	  
	  
	  
	  System.out.print(arra[i]); }
	  
	  
	  
	  
	  
	  }
	  
	  @Test(priority = 3)
	  void stringrevbysplit() { String word3 =
	  "this is my  third java program";
	  
	  String nw[] = word3.split(" "); 
	  for (int j = nw.length - 1; j >= 0; j--) {
	  System.out.print(nw[j] + "  "); }
	  
	  }
	 

	  @Test(priority = 4)
	void stringrevbylength() {
		
		
		

		String word4 = "this is my fourth java program";

		String revv = " ";
		int find = word4.length();
		
		for (int x = find - 1; x >= 0; x--) {
			revv = revv + word4.charAt(x);

		}
		
		
		System.out.println(revv);

	}

}
