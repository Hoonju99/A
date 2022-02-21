package com.yedam.java.User;

import java.sql.SQLException;

import com.yedam.java.Kiosk.KioskDAO;
import com.yedam.java.common.DAO;



public class UserDAOImpl extends DAO implements UserDAO {

	
	private static UserDAO instance = new UserDAOImpl();

	private UserDAOImpl() {
	}

	public static UserDAO getinstance() {
		return instance;
	}
	
	
	@Override
	public void insert(User user) {
		
		
		try {
			connect();
			String insert = "INSERT INTO user VALUES (?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			
			int result = pstmt.executeUpdate();

			System.out.println(result + "회원가입이 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		
		
	}

	@Override
	public User selectOne(String id, String pw) {
		User us = null;
		try {
			connect();
			String select = "SELECT * FROM User WHERE id =? AND pw = ? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				us = new User();
				
				us.setId(rs.getString("id"));
				us.setPw(rs.getString("pw"));
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return us;
	}

}
