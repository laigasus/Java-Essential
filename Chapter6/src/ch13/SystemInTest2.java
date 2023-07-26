package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

		int i;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			while ((i = isr.read()) != '\n') {
				sb.append((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(sb);
	}
}