package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MyFileReader {

	private char [] data;
	private int length;
	private File file;
	private BufferedReader bufferedReader;
	
	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}
	public MyFileReader(BufferedReader bufferedReader.readLine();
	this.bufferedReader = bufferedReader;
}
	
	public String readFile() {
		try {
			length = (int) file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			return dataFromFile;
		} catch (IOException e) {
			System.out.println("Error while reading File!!");
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error while Closing Flie");
			}
		}
		return "";
	}
	
}
