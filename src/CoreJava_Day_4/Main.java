package CoreJava_Day_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
public class Main {
	
	static void fileSize(String url) throws IOException {
		System.out.println("file size:");
		Path path=Paths.get(url);
		long size= Files.size(path);
		System.out.println(size+"byte");
	}
	static void read(String url) throws IOException {
		System.out.println("file content:");
		FileReader fr=null;
		fr=new FileReader(url);
		int ch;
		while ( (ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		System.out.println();
		fr.close();
	}
	static void delete(String url) throws IOException {
		File f=new File(url);
		if(f.delete()) {
			System.out.println("deleted file "+f.getName());
		} else {
			System.out.println("failed");
		}
		
	}
	static void numberOfWord(String url) throws IOException {
		FileReader fr=null;
		fr=new FileReader(url);
		String s="";
		int ch;
		while ( (ch = fr.read()) != -1) {
			s+=(char)ch;
		}
		// string tokenizer
		StringTokenizer st=new StringTokenizer(s," ");
		System.out.println(s);
		int count= st.countTokens();
		System.out.println(count);
		fr.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String urlString="./cogent.txt";
		/*
		 * Scanner sc=new Scanner(System.in); String content; // input
		 * System.out.println("enter your input:"); content=sc.nextLine(); FileWriter
		 * fw=null; // URL ; //file fw=new
		 * FileWriter(urlString); fw.write(content); System.out.println("success");
		 * fw.close(); // size fileSize(urlString); // read //read(urlString); // delete
		 * //delete(urlString);
		 */		
		numberOfWord(urlString);
		
	}

}
