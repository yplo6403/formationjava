package com.orange.formationjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadResource {

	/**
	 * Opens a text file and display its content.
	 *
	 * @param filename
	 *            the file name
	 * @return true if file exists and can be printed
	 */
	public boolean openAndDisplayFile(String filename) {
		System.out.println("--- File start ---");

		ClassLoader classLoader = getClass().getClassLoader();
		// Care: getResource returns null if resource cannot be found!
		URL url = classLoader.getResource(filename);
		String filenameFromUrl = url.getFile();
		FileInputStream fstream = new FileInputStream(filenameFromUrl);
		BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();

		System.out.println("--- File End ---");
		return true;
	}

}
