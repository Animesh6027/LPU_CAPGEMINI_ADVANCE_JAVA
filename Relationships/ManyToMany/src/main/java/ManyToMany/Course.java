package ManyToMany;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "course_seq")
	@SequenceGenerator(name = "course_seq", sequenceName = "course_sequence", initialValue = 10, allocationSize = 10)
    private int courseId;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    // Getters & Setters
    
    
    public int getCourseId() { return courseId; }
    public void setCourseName(String courseName) {
    	this.courseName = courseName;
    }
    public String getCourseName() {
    	return courseName;
    }
    public List<Student> getStudents(){
    	return students;
    }
}
