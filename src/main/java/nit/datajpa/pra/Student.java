package nit.datajpa.pra;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="stud_db_pra")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stu_id")
	private int id;
	@Column(name="Stu_name")
	private String name;
}
