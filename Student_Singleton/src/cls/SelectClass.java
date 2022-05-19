package cls;

import dao.StudentDao;
import dto.StudentDto;

//학생 검색
public class SelectClass {
	
	public SelectClass() {
		// TODO Auto-generated constructor stub
	}
	public void process(String name) {
		StudentDao dao = StudentDao.getInstance();
		dao.search(name);
	}

}
