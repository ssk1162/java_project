package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Assss {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("디자이너");
		a.add("프로그래머");
		a.add("DB관리자");
		System.out.println(a);
		
		ArrayList b = new ArrayList();
		b.add("상한우유");
		b.add("싱싱우유");
		b.remove(0);
		System.out.println(b);
		
		ArrayList c = new ArrayList();
		c.add("엄마");
		c.add("아빠");
		c.add("친구");
		c.add("동생");
		System.out.println(c.get(1));
	}

}
