package com.yedam.java.app;

import java.util.Scanner;

import com.yedam.java.User.User;
import com.yedam.java.User.UserDAO;
import com.yedam.java.User.UserDAOImpl;

public class UserFrame {

	public Scanner scanner = new Scanner(System.in);
	private UserDAO dao = UserDAOImpl.getinstance();
	User loginUser = new User();

	public void run() {
		boolean run = true;

		while (true) {

			menuPrint();

			int menuNo = menuSelect();

			if (menuNo == 1) {
				insertUser();
			} else if (menuNo == 2) {
				loginUser();
			} else if (menuNo == 3) {
				end();
				break;
			}

		}
	}

	public void menuPrint() {
		System.out.println();
		System.out.println("====================================================");
		System.out.println("1.회원가입 | 2.로그인 | 3.종료");
		System.out.println("====================================================");
		System.out.print("선택>");

	}

	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	public void loginUser() {

		User us = inputLoginInfo();
		User loginUser = UserDAOImpl.getinstance().selectOne(us.getId(), us.getPw());
		// User loginUser = UserDAOImpl.getInstance().selectUserInfo(us);
		if (loginUser == null) {
			System.out.println("회원정보를 확인해주세요.");
		} else {
			System.out.println("성공적으로 로그인을 완료하였습니다.");
			new KioskFrame().run();
		}

		// } else if (loginUser.getAuth() == 0) {
		// 관리자일때 실행하는 메뉴
		// new KioskFrame().run();
		// } else if (loginUser.getAuth() == 1) {
		// 일반회원일떄 실행하는 메뉴
		// }   
	}

	private User inputLoginInfo() {
		User temp = new User();
		System.out.println("아이디");
		temp.setId(scanner.next());
		System.out.println("비밀번호");
		temp.setPw(scanner.next());
		return temp;
	}

	private User insertUser() {
		User us = inputUserInfo();
		dao.insert(us);
		return us;

	}

	private User inputUserInfo() {
		User us = new User();
		System.out.println("회원가입을 진행합니다");
		System.out.println("아이디를 입력하시오");
		us.setId(scanner.next());
		System.out.println("비밀번호를 입력하시오");
		us.setPw(scanner.next());

		return us;
	}

	public void selectOne() {
		String id = inputId();
		String pw = inputpw();
	}

	public String inputId() {
		System.out.print("아이디>");
		String id = scanner.next();
		return id;
	}

	public String inputpw() {
		System.out.print("비밀번호>");
		String pw = scanner.next();
		return pw;
	}

	public static void end() {
		System.out.println("프로그램 종료");
	}

}
