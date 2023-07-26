package ch15;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderTest {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt", Charset.forName("UTF-8"))) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}