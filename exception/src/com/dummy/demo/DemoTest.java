package com.dummy.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoTest {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Admin\\git\\J55\\exception\\src\\com\\dummy\\demo\\Test.java");
		FileInputStream f2=null;
		try {
			f2=new FileInputStream(f1);
			System.out.println("file Found");

		} finally {
			// TODO: handle finally clause
			f2.close();
			System.out.println("HEllo finally block");
		}
	}
}
