package info.vo;

public class StudentVO {
	//이름, 학변, 학년, 학과, 전번
	private String name;
	private int stuId;
	private int grade;
	private String major;
	private String mobile;
	
	//생서자 : 필드 값 초기화
	public StudentVO(String name, int stuId, int grade, String major, String mobile) {
		this.name = name;
		this.stuId = stuId;
		this.grade = grade;
		this.major = major;
		this.mobile = mobile;
	}
	
	//setter : 필드 값 설절
	//getter : 필드 값 반환
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", stuId=" + stuId + ", grade=" + grade + ", major=" + major + ", mobile="
				+ mobile + "]";
	}
	
	
}
