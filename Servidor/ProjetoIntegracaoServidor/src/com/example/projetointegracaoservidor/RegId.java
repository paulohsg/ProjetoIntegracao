package com.example.projetointegracaoservidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class RegId {
	
	public static ArrayList<String> id = new ArrayList<String>();
	
	
	
	
	
	public static ArrayList<String> getId() {
		return id;
	}



	public static void leIds(){
		
		InputStream is;
		try {
			is = new FileInputStream("regId.txt");
		
	     InputStreamReader isr = new InputStreamReader(is);
	     BufferedReader br = new BufferedReader(isr);
	 
	     String s = br.readLine();
	     
	     while (s != null) {
	       id.add(s);
	       s = br.readLine();
	     }
	     
	     br.close();
	   } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	}
		
	}
	
	
	public static boolean addId(String id){
		try{
		 OutputStream os = new FileOutputStream("regId.txt", true);
	     OutputStreamWriter osw = new OutputStreamWriter(os);
	     BufferedWriter bw = new BufferedWriter(osw);
	 
	     bw.write(id);
	     bw.newLine();
	     
	     bw.close();
	     
	     
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return true;
	}
	
}


