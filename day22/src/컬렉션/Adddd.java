package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Adddd {

	public static void main(String[] args) {
		
		HashSet a = new HashSet();
		a.add("디자이너");
		a.add("디자이너");
		a.add("프로그래머");
		a.add("DB관리자");
		a.add("디자이너");
		a.add("디자이너");
		System.out.println(a);
		
		LinkedList queue = new LinkedList();
		queue.add("상한우유");
		queue.add("싱싱우유");
		queue.remove();
		System.out.println(queue);
		
		HashMap c = new HashMap();
		c.put("1번은", " 엄마");
		c.put("2번은", " 아빠");
		c.put("3번은", " 친구");
		c.put("4번은", " 동생");
		System.out.println(c.get("2번은"));
		
		LinkedList b = new LinkedList();
		b.add("국어");
		b.add("수학");
		b.add("영어");
		b.add("컴퓨터");
		
		b.remove();
		System.out.println("1날" + b);
		b.remove();
		System.out.println("2날" + b);
		b.remove();
		System.out.println("3날" + b);
	}

}
