package com.test.example.inheritance;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

public class Ex67_figlet {
	
	public static void main(String[] args) throws IOException {
		
		// using default font standard.flf, obtained from maven artifact
	    String asciiArt1 = FigletFont.convertOneLine("AAA");
	    System.out.print(asciiArt1.replace("\r\n", ""));
	    
	    
	    String asciiArt2 = FigletFont.convertOneLine("doh.flf", "BBB");
	    System.out.println(asciiArt2);
	                  
	                
		
	}

}








