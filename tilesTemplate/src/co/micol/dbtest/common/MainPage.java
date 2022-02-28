package co.micol.dbtest.common;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.dbtest.member.service.MemberService;
import co.micol.dbtest.member.serviceImpl.MemberServiceImpl;
import co.micol.dbtest.member.vo.MemberVO;

public class MainPage implements DbCommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 시작페이지 돌려주기
		
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
	
		request.setAttribute("id", vo.getMemberId());
		request.setAttribute("memberName", vo.getMemberName());
		
		
		
		
		
		
		return "main/main.tiles";
	}

}
