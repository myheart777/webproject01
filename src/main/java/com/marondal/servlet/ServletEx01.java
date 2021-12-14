package com.marondal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글깨짐방지
		response.setCharacterEncoding("utf-8");
		
		//MIME 컨텐츠의 타입을 정의하는 정의된 표준 문서 
		response.setContentType("text/plain");
		
		//날짜를 저장하는 클래스
		Date now = new Date(); //java util date
		
		PrintWriter out = response.getWriter();
		//add throws declation (에러잡을 때 이거 클릭)
		out.println("Hello World");
		out.println(now);
		
		
		//formatter
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = format.format(now); // 이 객체가 문자열로 변환이 된다 
		out.println(dateString);
		
	}
	//이클래스까지 찾아오게.. url맵핑

}
