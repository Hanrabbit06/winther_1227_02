package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.StudentView;
import info.vo.StudentDAO;
import info.vo.StudentVO;

public class StudentController {
	private static final int CONTINUE = 1;
	private static final int BREAK = 0;
	
	//여러 학생 정보(동적)를 입력 받기 위해서
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<Integer> stuId = new ArrayList<Integer>();
	ArrayList<Integer> grades = new ArrayList<Integer>();
	ArrayList<String> majors = new ArrayList<String>();
	ArrayList<String> mobiles = new ArrayList<String>();
			
//콘솔창에서 입력받은 학생정보를 사용하여 각각의 ArrayList에 저장해 둔다.
	public void saveconsol() {
		//콘솔에 입력 받기 위해 Scanner생성
		Scanner s1 = new Scanner (System.in);
		Scanner s2 = new Scanner (System.in);
			
		//flag변수 : 콘솔창에서 학생정보를 입력 받을 때 계속 입력 받을 것인지 멈출것인지의 상태를 저장하는 변수
		int flag = CONTINUE;
		System.out.println("-----------------\t학생 정보 입력\t-----------------");
		while(true) {
			if(flag == CONTINUE) {
				System.out.print("--성명 입력 : ");
				names.add(s1.nextLine());
				System.out.print("--학번 입력 : ");
				stuId.add(s2.nextInt());
				System.out.print("--학년 입력 : ");
				grades.add(s2.nextInt());
				System.out.print("--학과 입력 : ");
				majors.add(s1.nextLine());
				System.out.print("--전화 입력 : ");
				mobiles.add(s1.nextLine());
			}else if(flag == BREAK) {
				break;
			}
			System.out.println("계속 학생정보를 입력받으시겠습니까?(계속: 1, 중지: 0) : ");
			flag = s2.nextInt();
		}
		
		s1.close();
		s2.close();
	}
	//StudentVO객체를 생성하고
	// 생성된 StudentVO객체를 StudentDAO 객체의 ArrayList에 저장한다. (insert() 사용)
	public void voToDAO(StudentDAO dao) {
		for (int i = 0; i < names.size(); i++) {
			StudentVO svo = new StudentVO(names.get(i), stuId.get(i), grades.get(i), majors.get(i), mobiles.get(i));
			dao.insert(svo);
		}
	}
	public static void main(String[] args) {
		StudentController controller = new StudentController();
		//콘솔창에서 입력 받은 값을 각각의 정보를 저장하는 AttayList에 저장하는 메소드
		controller.saveconsol();
		StudentDAO dao = new StudentDAO();
		controller.voToDAO(dao);
		StudentView sView = new StudentView();
		sView.view(dao.select());
	}
}
