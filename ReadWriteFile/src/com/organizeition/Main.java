package com.organizeition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {

		File file = new File("/home/kein/Downloads/test/test_data");

		FileInputStream fileInput = new FileInputStream(file);

		byte[] dataByteMas = new byte[(int) file.length()];

		fileInput.read(dataByteMas);

		String text = new String(dataByteMas);
		
		System.out.println(text);

		String[] rows = text.split("\n");

		ArrayList<String> listWord = new ArrayList<>();

		for (String row : rows) {
			String[] words = row.split("	");
			for (String word : words) {
				listWord.add(word);
			}
		}

		ArrayList<String> listFindData = new ArrayList<>();

		/*int count = 0;
		for (String word : listWord) {
			count++;
			// System.out.print(word);
			// System.out.print("|");
			if (count > 2) {
				listFindData.add(word);
				System.out.print(word);
				System.out.print("|");
			}
			if (count > 5) {
				System.out.println("__________");
				count = 0;
			}
		}*/
	}

}
