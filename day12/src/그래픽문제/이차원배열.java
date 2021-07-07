package 그래픽문제;

public class 이차원배열 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[][] s = new int[3][5];
      // 15개 +length+ s+...
      // 0 1 2 3 4
      // ====================
      // 0행 0 0 0 0 0
      // 1행 0 0 0 0 0
      // 2행 0 0 0 0 0

      s[1][1] = 1;
      s[1][2] = 1;
      s[1][3] = 1;
      s[2][4] = 1;
      System.out.println(s[1][1]);
      System.out.println(s[1][2]);
      System.out.println(s[1][3]);
      System.out.println(s[2][4]);

      // 영화 예매문제를 2차원으로 바꿔보자
      for (int i = 0; i < 3; i++) { // 2차원 행을 프린트 해주는거
         for (int j = 0; j < 5; j++) { // 1차원 배열 열
            System.out.print(s[i][j] + " ");

         }
         System.out.println();
      }
               //i=0일때 s[0][0] s[0][1] s[0][2] s[0][3] s[0][4]
               //i=1일때 s[1][0] s[1][1] s[1][2] s[1][3] s[1][4]
               //i=2일때 s[2][0] s[2][1] s[2][2] s[2][3] s[2][4]
      
      
      
      
      
   }

}