package cls;

import dao.StudentDao;
import dto.StudentDto;

//학생 삭제
public class DeleteClass {
	
	public DeleteClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void process(String name) {
		StudentDao dao = StudentDao.getInstance();
		int check=dao.search(name);
		
		if(check!=0)
		{
			for(StudentDto student:dao.list) {
				if(student.getName().equals(name))
				{
					dao.list.remove(student);
					System.out.println(name+"의 학생 정보가 삭제되었습니다");
					break;
				}
			}
		}
	}

}
