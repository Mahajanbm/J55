package com.demo.d;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream f1=new FileInputStream("Hello")) {
			
			
			
			f1.close();

		} 
	}
}
