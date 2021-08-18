package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		
		File file = new File("/Library/Java/JavaVirtualMachines/jdk1.8.0_291.jdk/Contents");
		File[] list = file.listFiles();
			System.out.println(list.length + "개");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		
		if (file.isDirectory()) {
			System.out.println("폴더");
		} else {
			System.out.println("파일");

		}
		}
		
	}//메인

}//클래스
