package nit.datajpa.pra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	//public void findByEmail(String email);
}
