package app.courses;

import app.participants.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RJ on 2017-04-06.
 */

@Entity
@Table(name = "GROUP")
public class CourseGroup {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "STUDENTS")
    @OneToMany(targetEntity = Student.class, mappedBy = "PESEL", cascade = {CascadeType.ALL})
    private List<Student> students;

    @Column(name = "GRADES")
    private List<Integer> grades;

}