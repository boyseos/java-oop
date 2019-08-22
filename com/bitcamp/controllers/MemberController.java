package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.services.MemberService;
public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		while(true) {
			switch (JOptionPane.showInputDialog("0. 종료\n"
					+ "1.회원가입\n "
					+ "2.마이페이지\n "
					+ "3.비번수정\n "
					+ "4.회원탈퇴")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				break;
			case "1":
				String spec = JOptionPane.showInputDialog("이름, 아이디, 비번, 주민번호, 혈액형, 키, 몸무게");
				
				break;
			case "2":

				break;
			case "3":

				break;

			default:
				break;
			}
		}
	}
}
