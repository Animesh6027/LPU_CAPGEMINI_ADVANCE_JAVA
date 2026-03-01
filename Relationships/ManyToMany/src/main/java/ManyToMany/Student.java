package ManyToMany;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "student_seq")
	@SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", initialValue = 1, allocationSize = 1)
    private int studentId;
    private String studentName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }

    // Getters & Setters
    public int getStudentId() { return studentId; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getStudentName() { return studentName; }
    public List<Course> getCourses() { return courses; }
}
