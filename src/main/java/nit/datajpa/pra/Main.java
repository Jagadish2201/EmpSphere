package nit.datajpa.pra;

import org.springframework.context.ApplicationContext;

public class Main {

	private ApplicationContext con;
	
	public void main(ApplicationContext con) {
		this.con=con;
		Student stu = new Student();
		stu.setName("jaga");
		StudentRepo studentRepo = con.getBean(StudentRepo.class);
		studentRepo.save(stu);
	}
	
	
}
