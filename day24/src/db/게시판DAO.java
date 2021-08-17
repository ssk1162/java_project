package db;

import dto.게시판Bag2;

public class 게시판DAO {
	
	public void create(게시판Bag2 bag) {

		System.out.println("전달된 제목은 " + bag.getWpahr());
		System.out.println("전달된 내용은 " + bag.getSodyd());
		System.out.println("전달된 이름은 " + bag.getDlfma());
		System.out.println("전달된 위치는 " + bag.getDnlcl());
	}
	public void read(String id) {
		
	}
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
