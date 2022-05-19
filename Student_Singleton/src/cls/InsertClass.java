package cls;

import java.util.Scanner;

import dao.StudentDao;
import dto.StudentDto;

//학생추가
public class InsertClass implements ProcessClass {
	
	public InsertClass() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void process() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("번호 = ");
		int number=s.nextInt();
		
		System.out.print("이름 = ");
		String name=s.next();
		
		System.out.print("영어 = ");
		int english=s.nextInt();
		
		System.out.print("수학 = ");
		int math=s.nextInt();
		
		StudentDto dto = new StudentDto(number, name, english, math);
		
		StudentDao dao = StudentDao.getInstance();
		dao.list.add(dto);
	}

}
