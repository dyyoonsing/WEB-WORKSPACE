package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExamMethodServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//404는 mapping안된거 405는 servlet 내에 doGet doPost가 제대로 안된것
		
		//http://localhost:9999/Lecture-WEB/examMethod?name=dayoung&hobby=reading&hobby=music&hobby=movie
		String name = request.getParameter("name");
		//String hobby = request.getParameter("hobby");
		//복수개를 뽑아내고 싶을때
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println("name : " + name);
		//System.out.println("hobby : " + hobby);
		System.out.print("hobby : ");
		for(int i = 0; i< hobby.length;i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
		
		
		/*
		 * 이름 : hong
		 * 취미 : reading, music, movie
		 * 클라이언트 화면에
		 */
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>출력결과</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("이름 : " + name + "<br>");
		out.println("취미  : ");
		for(int i = 0; i< hobby.length;i++) {
			out.println(hobby[i] + " ");
		}
		
		out.println("	</body>");
		out.println("</html>");
	}

}












