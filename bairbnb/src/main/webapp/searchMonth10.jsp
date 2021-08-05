<%@page import="java.util.ArrayList"%>
<%@page import="search.dto.searchBag"%>
<%@page import="search.db.searchDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   
   <%
      String word = request.getParameter("word");
      
      searchDAO dao = new searchDAO();
         ArrayList<searchBag> bag2 = dao.read(word);
      
   %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/searchCSS.css">

<script type="text/javascript">

	function myFunction() {
		  document.getElementById("myDropdown").classList.toggle("show");
		}
	
		// Close the dropdown menu if the user clicks outside of it
		window.onclick = function(event) {
		  if (!event.target.matches('.dropbtn')) {
		    var dropdowns = document.getElementsByClassName("dropdown-content");
		    var i;
		    for (i = 0; i < dropdowns.length; i++) {
		      var openDropdown = dropdowns[i];
		      if (openDropdown.classList.contains('show')) {
		        openDropdown.classList.remove('show');
		      }
		    }
		  }
		}
		
		function myFunction2() {
			  document.getElementById("myDropdown2").classList.toggle("show");
			}
		
			// Close the dropdown menu if the user clicks outside of it
			window.onclick = function(event) {
			  if (!event.target.matches('.dropbtn2')) {
			    var dropdowns = document.getElementsByClassName("dropdown-content2");
			    var i;
			    for (i = 0; i < dropdowns.length; i++) {
			      var openDropdown = dropdowns[i];
			      if (openDropdown.classList.contains('show')) {
			        openDropdown.classList.remove('show');
			      }
			    }
			  }
			}
		
</script>

</head>
<body>
    <div id="total">
      <div id="top">
         
         <ul>
				<li>
					<div class="dropdown">
						<button onclick="myFunction()" class="dropbtn">체크인</button>
					<div id="myDropdown" class="dropdown-content">
						<!-- 체크인 달력 스타트 -->
							<table>
					
								<tr>
					
									<td><a href="./searchMain.jsp">8월</a></td>
					
									<td><a href="./searchMonth09.jsp">9월</a></td>
					
									<td><a href="./searchMonth10.jsp">10월</a></td>
					
								</tr>
					
							</table>
							
							<table>
	
								<tr>
						
									<td>일</td>
						
									<td>월</td>
						
									<td>화</td>
						
									<td>수</td>
						
									<td>목</td>
						
									<td>금</td>
						
									<td>토</td>
						
								</tr>
						
								<tr>
						
									<td></td>
						
									<td></td>
						
									<td></td>
						
									<td></td>
						
									<td>1</td>
						
									<td>2</td>
						
									<td id="holiday">3</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">4</td>
						
									<td>5</td>
						
									<td>6</td>
						
									<td>7</td>
						
									<td>8</td>
						
									<td>9</td>
						
									<td id="holiday">10</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">11</td>
						
									<td>12</td>
						
									<td>13</td>
						
									<td>14</td>
						
									<td>15</td>
						
									<td>16</td>
						
									<td id="holiday">17</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">18</td>
						
									<td>19</td>
						
									<td>20</td>
						
									<td>21</td>
						
									<td>22</td>
						
									<td>23</td>
						
									<td id="holiday">24</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">25</td>
						
									<td>26</td>
						
									<td>27</td>
						
									<td>28</td>
						
									<td>29</td>
						
									<td>30</td>
						
									<td id="holiday">31</td>
						
								</tr>
						
							</table>
							<!-- 체크인 달력 끝 -->
					</div>
					</div>
					
				</li>
				<li>
					<div class="dropdown">
						<button onclick="myFunction2()" class="dropbtn">체크아웃</button>
					<div id="myDropdown2" class="dropdown-content">
					
						<!-- 체크아웃 달력 스타트 -->
							<table>
					
								<tr>
					
									<td><a href="./searchMain.jsp">8월</a></td>
					
									<td><a href="./searchMonth09.jsp">9월</a></td>
					
									<td><a href="./searchMonth10.jsp">10월</a></td>
					
								</tr>
					
							</table>
							
							<table>
	
								<tr>
						
									<td>일</td>
						
									<td>월</td>
						
									<td>화</td>
						
									<td>수</td>
						
									<td>목</td>
						
									<td>금</td>
						
									<td>토</td>
						
								</tr>
						
								<tr>
						
									<td></td>
						
									<td></td>
						
									<td></td>
						
									<td></td>
						
									<td>1</td>
						
									<td>2</td>
						
									<td id="holiday">3</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">4</td>
						
									<td>5</td>
						
									<td>6</td>
						
									<td>7</td>
						
									<td>8</td>
						
									<td>9</td>
						
									<td id="holiday">10</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">11</td>
						
									<td>12</td>
						
									<td>13</td>
						
									<td>14</td>
						
									<td>15</td>
						
									<td>16</td>
						
									<td id="holiday">17</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">18</td>
						
									<td>19</td>
						
									<td>20</td>
						
									<td>21</td>
						
									<td>22</td>
						
									<td>23</td>
						
									<td id="holiday">24</td>
						
								</tr>
						
								<tr>
						
									<td id="holiday">25</td>
						
									<td>26</td>
						
									<td>27</td>
						
									<td>28</td>
						
									<td>29</td>
						
									<td>30</td>
						
									<td id="holiday">31</td>
						
								</tr>
						
							</table>
							<!-- 체크아웃 달력 끝 -->
					</div>
					</div>
					
				</li>

				<li>
					<!-- 검색 버튼쪽 -->
               <form action="searchRead.jsp">

                  <input type="text" name="word" placeholder="어디로 여행가세요?" size=17>
                  <button id="btn">검색</button>

               </form>
            </li>
            
         </ul>
         <br>
         <br>
         <br>
         <div class="list_wrap">
                <%
                for (searchBag dto : bag2) {
            %>
                <div class="list">
                    <div class="list_img">
                        <img src="img/<%= dto.getProimg() %> " width="350" height="500"><br> <!-- 이미지 출력 -->
                    </div>
                    <div class="list_text">
                        <span><%= dto.getProid() + " " %></span> <!-- 상품아이디 -->
                        <span><%= dto.getPronam() + " " %></span> <!-- 방 이름 -->
                        <span><%= dto.getProadd() + " " %></span> <!-- 주소 -->
                        <span><%= dto.getProtel() + " " %></span><br> <!-- 전화번호 -->
                        <span><%= dto.getProprice() %>원</span><br> <!-- 가격 -->
                        <span><%= dto.getPropk() + " " %></span> <!-- 주차여부 -->
                        <span><%= dto.getProwifi() + " " %></span><br> <!-- 와이파이여부 -->
                        <span><%= dto.getPropet() + " " %></span> <!-- 펫여유 -->
                        <span><%= dto.getProbk() + " " %></span> <!-- 조식여부 -->
                    </div>
                </div>
            <%} %>   
         </div>

      </div>

   </div>
</body>
</html>