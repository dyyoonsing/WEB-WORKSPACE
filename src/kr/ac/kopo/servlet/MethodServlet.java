package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:9999/Lecture-WEB/method
public class MethodServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//클라이언트가 서버에게 요청 request
		String method = request.getMethod();
//		System.out.println("요청 Method : " + method);
		
		//나한테 어떤 정보가 들어왔는지 궁금!
		String uri = request.getRequestURI();
//		System.out.println("요청 URI : " + uri);
		
		//웹서비스는 1대다의 관계.정보를 더해야 하는데 string쓰면 +할때 속도 느려지니까 StringBuffer써야
		StringBuffer url = request.getRequestURL();
//		System.out.println("요청 URL : " + url);
		
		//request.getParameter가 각각 인자값 알아오는 메소드
		String id = request.getParameter("id");		//()안에는 name이 들어옴
//		System.out.println("id : " + id);
		
		
		//서버가 클라이언트에게 응답하고 싶을땐 response
		//서버가 가지고 있는 데이터를 보내는거니까 outputStream
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 호출 결과</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("====================================<br>");
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("====================================<br>");
		out.println("파라미터(id) : " + id + "<br>");
		out.println("요청방식 : " + method + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("URL : " + url + "<br>");
		out.println("====================================<br>");
		out.println("	</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//doPost 메소드는 무조건 setCharacterEncoding이 필요함! 그래야 글자가 안 깨짐
		request.setCharacterEncoding("utf-8");
		
		String method = request.getMethod();
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String id = request.getParameter("id");		
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 호출 결과</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("====================================<br>");
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("====================================<br>");
		out.println("파라미터(id) : " + id + "<br>");
		out.println("요청방식 : " + method + "<br>");
		out.println("URI : " + uri + "<br>");
		out.println("URL : " + url + "<br>");
		out.println("====================================<br>");
		out.println("	</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
		
	}

	
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) 
//			throws ServletException, IOException {
//		
//		//폼태그 제외 모든 방식이 get 방식이니까 지금은 get만 날아옴
//		String method = request.getMethod();
//		System.out.println("요청 방식 : " + method);
//	}
//	//service 안에는 doGet과 doPost가 있음, service나 doGet을 안하면 405에러남
	//405에러가 servlet과 관련된 에러임

	
	

}
