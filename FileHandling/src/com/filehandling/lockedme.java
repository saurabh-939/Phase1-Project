package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class lockedme {
	
	public static void readList() {
		Scanner f=new Scanner(System.in);
		System.out.println("Enter file location");
		String filename=f.next();
	    String[] pathnames;

        File file = new File(filename);

        pathnames = file.list();
        int n;
        n=pathnames.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                // to compare one string with other strings
                if (pathnames[i].compareTo( pathnames[j]) > 0) {
                    // swapping
                    temp =  pathnames[i];
                    pathnames[i] =  pathnames[j];
                    pathnames[j] = temp;
                }
            }
        }

        for (String pathname : pathnames) {
          
            System.out.println(pathname);
        }
		
	}
	
	public static void operations() throws IOException {
		Scanner s2=new Scanner(System.in);
		System.out.println("Select Operation :");
		int val=s2.nextInt();
		if(val==1) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter file name to create:");
		String filename=s1.next();
		
		File file=new File("C:\\Users\\Saurabh\\Desktop\\Files\\"+filename);
		if(file.createNewFile()) {
		System.out.println("File Created");

	
		}else {
			System.out.println("File already exists");
		}
		}else if(val==2) {
			try {
				Scanner s3=new Scanner(System.in);
				System.out.println("Enter file name to delete:");
				String inputFile1 =s3.next();
				
			 Files.deleteIfExists(Paths.get("C:\\Users\\Saurabh\\Desktop\\Files\\"+inputFile1));
		 }catch(NoSuchFileException e) {
			 
		 }catch(DirectoryNotEmptyException e) {
			 
		 }catch(IOException e) {
			 
		 }
		}else if(val==3) {
			
		}
	}
	public static void main(String args[]) {
		readList();
	}

}
