package 프로젝트day03;

public class 기본데이터 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		int classNo = 8;
		double temp = 26.2;
		char day = '목';
		boolean food = false;
		String lunch = "1층 가서 생각해보자";
		
		//한 줄 복사 : 컨트롤 + 알트 + 화살표 아래
		//한 줄 이동 : 알트 + 화살표
		
		System.out.println("오늘 온도 " + temp + "도");
		System.out.println("오늘 수업 수 " + classNo);
		System.out.println("오늘 요일 " + day);
		System.out.println("아침 먹었나 " + food);
		System.out.println("점심 뭐먹지 " + lunch);
		System.out.println(temp == 27.5);
		System.out.println(temp > 27.5);
		
		// 오늘 온도 29.2로 변경하여, 어제의 온도보다 낮은지?
		
		temp = 29.2;
		System.out.println(temp > 27.5);
		
		
	}

}
