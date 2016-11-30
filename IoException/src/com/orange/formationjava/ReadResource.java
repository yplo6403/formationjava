package com.orange.formationjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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

		BufferedReader reader = null;
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			FileInputStream fstream = new FileInputStream(classLoader.getResource(filename).getFile());
			reader = new BufferedReader(new InputStreamReader(fstream));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("--- File End ---");
			return true;

		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
			return false;

		} finally {
			if (reader != null) {
				try {
					reader.close();

				} catch (IOException e) {
					// ignore
				}
			}
		}
	}

}
