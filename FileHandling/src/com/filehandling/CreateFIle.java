package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CreateFIle {

	public static void createFileUsigFileClass()throws IOException{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter file name to create:");
		String filename=s1.next();
		
	File file=new File("C:\\Users\\Saurabh\\Desktop\\Files\\"+filename);
	if(file.createNewFile()) {
		System.out.println("File Created");

	
	}else {
		System.out.println("File already exists");
	}
}
	public static void writeFile()throws IOException{
		Scanner f=new Scanner(System.in);
		System.out.println("Enter file name to write data");
		String filename=f.next();
		
	File file=new File("C:\\Users\\Saurabh\\Desktop\\Files\\"+filename);
		FileWriter writer=new FileWriter(file);
		
		System.out.println("Enter data to write");
		Scanner s2=new Scanner(System.in);
		String str= s2.nextLine();
		writer.write(str);
		writer.close();	
	}
	 public static void appendStrToFile(String fileName,String data)
{
		 try {
			 BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Saurabh\\Desktop\\Files\\"+fileName, true));
			 out.write(data);
			 out.close();
}

		 catch (IOException e) {
		System.out.println("exception occurred" + e);
}
}
	 public static void deleteFile() {
		 try {
				Scanner s7=new Scanner(System.in);
				System.out.println("Enter file name to delete:");
				String inputFile1 =s7.next();
				
			 Files.deleteIfExists(Paths.get("C:\\Users\\Saurabh\\Desktop\\Files\\"+inputFile1));
		 }catch(NoSuchFileException e) {
			 
		 }catch(DirectoryNotEmptyException e) {
			 
		 }catch(IOException e) {
			 
		 }
	 }

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
	
  
	  public  static void modifyFile(String file_name, String old_str, String new_str)
	    {
	        File fileToBeModified = new File("C:\\Users\\Saurabh\\Desktop\\Files\\"+file_name);
	        String oldContent = "";
	        BufferedReader reader = null;
	        FileWriter writer = null;
	        try
	        {
	            reader = new BufferedReader(new FileReader(fileToBeModified));
	            String line = reader.readLine();
	            while (line != null) 
	            {
	                oldContent = oldContent + line + System.lineSeparator();
	                line = reader.readLine();
	            }
	            String newContent = oldContent.replaceAll(old_str, new_str);
	            writer = new FileWriter(fileToBeModified);
	            writer.write(newContent);
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                reader.close();
	                writer.close();
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }



public static void main(String args[]) throws IOException {
	Scanner s3=new Scanner(System.in);
	System.out.println("Enter your choice name: \n 1.Create file \n 2.Write File  \n 3.Read File  \n 4.Append file \n 5.Delete \n 6.Update File");
	int val=s3.nextInt();
	
	switch(val) {
	case 1:
	try {
		createFileUsigFileClass();
		
	}catch(IOException e) {
	System.out.println(e);
	
	}
break;
	
	case 2:
		writeFile();
		break;
	case 3:	
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter your file name:");
		String fname=s4.next();
		List<String> result=readFile("C:\\Users\\Saurabh\\Desktop\\Files\\"+fname);
		Iterator<String> it=result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		break;
		
	case 4:
		Scanner s5=new Scanner(System.in);
		System.out.println("Enter file name to append:");
		String fileName=s5.next();	 
    	System.out.println("Enter String to append :");
    	Scanner s6=new Scanner(System.in);
		String data=s6.next();
        appendStrToFile(fileName, data);
		break;
		
	case 5:
		deleteFile();
		break;
	case 6:
		Scanner s7=new Scanner(System.in);
		System.out.println("Enter file name to Update:");
		String file_name=s7.next();	 
    	System.out.println("Enter old string :");
    	Scanner s8=new Scanner(System.in);
		String old_str=s8.next();
		System.out.println("Enter new String :");
    	Scanner s9=new Scanner(System.in);
		String new_str=s9.next();
		modifyFile(file_name,old_str,new_str);
		break;
	default:
		System.out.println("Wrong choice");
	}
}
}

