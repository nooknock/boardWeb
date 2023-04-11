package com.springbook.view.board;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//������ �����̳ʴ� @Controller�� ����� ��ü�� �ڵ����� Controller ��ü�� �ν��Ѥ�.
//@Component�� ����� Controller�� @Controller�� ���� Ŭ������ ��ü�� �޸𸮿� �����ϴ� ����� ����, ������ �ܼ��� ��ü�� �����ϴ� ���� ��ġ�� �ʰ�, DispatcherServlet�� �ν��ϴ� Controller ��ü�� ����� �ش�.
@Controller //web.servlet.Controller�� �� ���� stereotype.Controller�� ���
public class InsertBoardController {

	//Annotation for mapping web requests onto specific handler classes and/or handler methods. 
	//Provides a consistent style between Servlet and Portlet environments,  
	//with the semantics adapting to the concrete environment.
	//������������ @RequestMapping�� �̿��Ͽ� HandlerMapping ������ ��ü�Ѵ�.
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo,BoardDAO boardDAO) { // ����ڰ� �Է��ϴ� ������ ���ų� ����Ǵ� ��Ȳ������ ��Ʈ�ѷ� Ŭ������ ����Ǿ�� �ϹǷ� �����ϴ�. �Ű������� ���� VO��ü�� �̿��ϸ� �ȴ�.
		System.out.println("�� ��� ó��");   // ������ �����̳ʰ� insertBoard() �޼ҵ带 ������ �� ����ڰ� �Է��� ������ BoardVo ��ü�� �����ؼ� �Ѱ��ش�.
											// ��������� ����� �Է� ���� ����� Vo ��ü ����, �׸��� �� ������ ��� �����̳ʰ� �ڵ����� ó��
											// DAO ��ü ���� �Ű������� �����ϸ� ������ �����̳ʰ� �ش� ��ü�� �����Ͽ� �������ش�.
											// �����̳ʰ� ����������Ʈ ���ҵ� �� ��?
		
		// 1. ����� �Է� ���� ����
//		// request.setCharacterEncoding("EUC-KR");
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//		
//		// 2. DB ���� ó��
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);
		
		
		//Ŭ���̾�Ʈ�� �� ����� ��û�ϸ� ������ �����̳ʴ� InsertBoardController ��ü��
		//InsertBoard()�޼ҵ带 ȣ���Ѵ�.
		//�� �� ������ �ش��ϴ� BoardVO ��ü�� �����ϰ�
		//����ڰ� �Է��� �Ķ����(title, writer, content) ������ �����Ͽ� BoardVO ��ü�� �����Ѵ�.
		//�� �� BoardVO Ŭ������ Setter �޼ҵ���� ȣ��ȴ�.
		//insertBoard() �޼��� ȣ��� ����� �Է°����� ������ BoardVO ��ü�� ���ڷ� ���޵ȴ�.
		//���⼭ �߿��� ���� Form �±� ���� �Ķ���� �̸��� ��ü�� Setter�޼ҵ� �̸��� �ݵ�� ��ġ�ؾ� �Ѵ�.
		//�� �Ķ���� �̸��� �ش��ϴ� setTitle(), setWriter(), setContent() �޼ҵ尡 �־�� Setter �����ǿ� ���� �ڵ����� ����� �Է°��� ����ȴ�.		
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("�� ��� ó��");
//		
//		// 1. ����� �Է� ���� ����
//		// request.setCharacterEncoding("EUC-KR");
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//		
//		// 2. DB ���� ó��
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);
//		
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.insertBoard(vo);
//		
//		// 3. ȭ�� �׺���̼�
//		//return "getBoardList.do"; //�� ��Ͽ� �����ϸ� ��ϵ� ���� ���Ե� �� ����� �ٽ� �˻��ؾ� ��, ���� getBoardList.do ���ڿ��� �����Ͽ� �����̷�Ʈ ó��
//	
//		
//		//3.ȭ�� �׺���̼�
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
//	}



}
