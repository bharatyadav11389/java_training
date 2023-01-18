package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;
import com.citibank.main.domain.WriteMyFile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
//		MyFileMetadata filemetadata = new MyFileMetadata();
//		filemetadata.printFileMetadata();
		
//		ReadMyFile readmyfile = new ReadMyFile();
//		readmyfile.readFile();
//		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path and file name with extension");
		String path = scanner.next();
		System.out.println("Enter the data for file");
		String data = scanner.next();
		File file = new File(path);
		OutputStream outputStream = null;
		WriteMyFile writeMyfile = null;
		try {
			outputStream = new FileOutputStream(path);
			writeMyfile = new WriteMyFile(outputStream, data);
			if(writeMyfile.writeFile()) {
				System.out.println("Please Check your file");
				}
			else {
				System.out.println("Failed to write file");
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			}catch ( IOException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
