package app.courses;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RJ on 2017-04-06.
 */

@Entity
@Table(name = "COURSES")
public class CourseInstance implements Course {
    @Id
    @Column(name = "NAME")
    private String courseName;
    @Column(name = "TERM")
    private String term;
    @OneToMany(targetEntity = CourseGroup.class, mappedBy = "ID", cascade = {CascadeType.ALL})
    private List<CourseGroup> groups = new ArrayList<>();


    @Override
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public String getTerm() {
        return this.term;
    }

    @Override
    public List getGroups() {
        return this.groups;
    }
}
