package dao;

import java.util.ArrayList;
import java.util.List;

import dto.StudentDto;

//DAO Data Access Object=CRUD
//Singleton
public class StudentDao {
	
	private static StudentDao dao=null;
	public List<StudentDto> list=null;
	
	private StudentDao() {
		// TODO Auto-generated method stub
		list=new ArrayList<StudentDto>();
	}
	
	public static StudentDao getInstance() {
		
		if(dao==null) {
			dao = new StudentDao();
		}
		return dao;
		
	}
	public int search(String name) {
		StudentDao dao = StudentDao.getInstance();
		int check=0;
		for(StudentDto student:dao.list) {
			if(student.getName().equals(name))
			{
				System.out.println("번호 = "+student.getNumber());
				System.out.println("이름 = "+student.getName());
				System.out.println("영어 = "+student.getEnglish());
				System.out.println("수학 = "+student.getMath());
				check=1;
				break;
			}
		}
		if(check==0) {
			System.out.println("찾지 못하였습니다");
		}
		return check;
	}

}
