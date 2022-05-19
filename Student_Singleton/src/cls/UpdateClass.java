package cls;

import java.util.Scanner;

import dao.StudentDao;
import dto.StudentDto;

//학생 정보 수정
public class UpdateClass {
	
	public UpdateClass() {
		// TODO Auto-generated constructor stub
	}
	public void process(String u_name) {
		StudentDao dao = StudentDao.getInstance();
		int i=0;
		for(StudentDto student:dao.list) {
			i++;
			if(student.getName().equals(u_name))
			{
				Scanner s = new Scanner(System.in);
				
				System.out.print("번호 = ");
				int number=s.nextInt();
				student.setNumber(number);
				
				System.out.print("이름 = ");
				String name=s.next();
				student.setName(name);
				
				System.out.print("영어 = ");
				int english=s.nextInt();
				student.setEnglish(english);
				
				System.out.print("수학 = ");
				int math=s.nextInt();
				student.setMath(math);
				
				System.out.println(u_name+"의 정보가 업데이트 되었습니다");
				break;
			}
		}
	}

}
