package com.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	public static List<String> readFile(String fileName)
	{
		List<String> list=Collections.emptyList();
		try {
			list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your file name:");
		String str=sc.next();
		List<String> result=readFile("C:\\Users\\Saurabh\\Desktop\\Files\\"+str);
		Iterator<String> it=result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
