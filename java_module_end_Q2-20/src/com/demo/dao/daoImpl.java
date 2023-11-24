package com.demo.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Set;


public class daoImpl {
	static HashMap<String,Integer> hm;
	static int cnt=0;
	static {
		hm= new HashMap<>(7);
	}
	
	public void save(String k,Integer v) { // course,duration
		for(String s: hm.keySet()) {
			if(s.equals(k)) {
				hm.put(k, hm.get(s)+v);
				break;
			}
			
		}
		hm.put(k, v);
	}
	
	public void display() { 
		for(String s: hm.keySet()) {
			System.out.println(s+"->"+ hm.get(s));
		}
	}
	
	public void writeFile() {
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("hmfile.txt"))){
			for(String s: hm.keySet()) {
				bw.write( s+","+ hm.get(s).toString()+"\n");
			}
			System.out.println("File saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
