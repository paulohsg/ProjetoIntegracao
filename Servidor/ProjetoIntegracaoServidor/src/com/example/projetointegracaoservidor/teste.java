package com.example.projetointegracaoservidor;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {
		RegId.addId("teste");
		System.out.println(RegId.addId("teste1"));
		
		
		
		
		RegId.leIds();
		
		ArrayList<String> al = RegId.getId();
		
		for(String s : al){
			System.out.println(s);
		}

	}

}
