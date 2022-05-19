package main;

import java.util.Scanner;

import cls.DeleteClass;
import cls.InsertClass;
import cls.ProcessClass;
import cls.SelectClass;
import cls.UpdateClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//프로그램 순서 initialize->loop->release
		
		//menu 추가(insert),삭제(delete),검색(select),수정(update)
		while(true) {
			ProcessClass pc = null;
			
			System.out.println(">>>>>>>>>> menue");
			System.out.println("1. 학생추가");
			System.out.println("2. 학생삭제");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생수정");
			System.out.println("5. 종료");
			
			System.out.print("작업번호 >> ");
			int number=s.nextInt();
			
			switch(number) {
			case 1:
				pc = new InsertClass();
				break;
			case 2:
				System.out.println("삭제하실 학생 이름을 입력하세요: ");
				String d_name=s.next();
				DeleteClass dc = new DeleteClass();
				dc.process(d_name);
				break;
			case 3:
				System.out.println("찾으실 학생 이름을 입력하세요: ");
				String s_name=s.next();
				SelectClass sc = new SelectClass();
				sc.process(s_name);
				break;
			case 4:
				System.out.println("수정할 학생 이름을 입력하세요: ");
				String u_name=s.next();
				UpdateClass uc=new UpdateClass();
				uc.process(u_name);
				break;
			case 5:
				System.exit(0);
				break;
			}
			
			
			pc.process();
		}
	}

}
