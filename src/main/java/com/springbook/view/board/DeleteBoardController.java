package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController  {

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo,BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("글 삭제 처리");
//		
//		ModelAndView mav=new ModelAndView();
//		
//		// 1. 사용자 입력 정보 추출
//		String seq = request.getParameter("seq");
//		
//		// 2. DB 연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.deleteBoard(vo);
//		mav.setViewName("redirect:getBoardList.do");
//		// 3. 화면 네비게이션
//		return mav;
//	}

}
