package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PInfoServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String name 	= req.getParameter("name");
		String id		= req.getParameter("id");
		String password = req.getParameter("password");
		String sex		= req.getParameter("sex");
		String mail		= req.getParameter("mail01");
		String mail2	= req.getParameter("mail02");
		String mail3	= req.getParameter("mail03");
		String job		= req.getParameter("job");
		
		System.out.println(mail);
		System.out.println(mail2);
		System.out.println(mail3);
		
		resp.setContentType("text/html; charset=utf8");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html>");
		pw.println("	<head>");
		pw.println("	<title>개인정보출력페이지</title>");
		pw.println("	</head>");
		pw.println(" 	<body> ");
		pw.println("<h1>개인 정보 출력</h1><br>");
		pw.println("이름 : " + name + "<br>");
		pw.println("아이디 : " + id + "<br>");
		pw.println("암호 : " + password + "<br>");
		pw.println("성별 : " + sex + "<br>");
		pw.println("공지메일 : " + mailCheck(mail) + "<br>");
		pw.println("광고메일 : " + mailCheck(mail2) + "<br>");
		pw.println("배송확인메일 : " + mailCheck(mail3) + "<br>");
		pw.println("직업 : " + job + "<br>");
		pw.println(" 	</body> ");
		pw.println("</html>");
		
		pw.flush();
		pw.close();
	}
	
	public String mailCheck(String string) {
		
		String result = "받음";
		if(string == null) {
			result = "받지 않음";
		}
		return result;
	}
	
	

}
