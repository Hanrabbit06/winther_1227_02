package info.view;

import java.util.ArrayList;

import info.vo.StudentVO;

//화면에 보여주기(출력) 위한 객체
public class StudentView {
	
	//view(ArrayList<StudentVO> sovList) : 화면에 출력을 위한 메소드
	public void view(ArrayList<StudentVO> sovList) {
		for (StudentVO StudentVO : sovList) {
			System.out.println("=======================");
			System.out.println("== 성명 : "+StudentVO.getName());
			System.out.println("== 학번 : "+StudentVO.getStuId());
			System.out.println("== 학년 : "+StudentVO.getGrade());
			System.out.println("== 학과 : "+StudentVO.getMajor());
			System.out.println("== 전화 : "+StudentVO.getMobile());
			System.out.println("=======================");
			
		}
	}
}
