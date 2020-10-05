package com.avinash.Pages;

import java.io.File;
import java.util.Scanner;

public class ElementFileHandler {

	String eleProperty;
	String eleValue;

	@SuppressWarnings("resource")

	public void Gives_Element_Value(String elename) throws Exception {
		File file = new File(".\\src\\test\\resources\\PageObjects\\PagesElements.spec");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] linesplit = line.split("										");
			if (linesplit[0].equalsIgnoreCase(elename)) {
				eleProperty = linesplit[1];
				eleValue = linesplit[2];
			}

		}
	}

}
