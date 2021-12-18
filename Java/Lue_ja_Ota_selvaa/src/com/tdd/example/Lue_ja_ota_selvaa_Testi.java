package com.tdd.example;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import com.tdd.example.LueJaOtaSelvaa.vertailuVaihtoehdot;

public class Lue_ja_ota_selvaa_Testi {	
	
	@Test
	public void lueTiedostoja() {			
		LueJaOtaSelvaa olio1 = new LueJaOtaSelvaa();
		olio1.LueTiedostot();
	}	
	@Test
	public void vertaileKoordinaatteja() {
		LueJaOtaSelvaa olio1 = new LueJaOtaSelvaa();
		olio1.vertailuVaihtoehdot();		
	}	
	
}
 