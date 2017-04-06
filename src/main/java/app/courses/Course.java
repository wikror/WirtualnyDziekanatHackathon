package main.app.courses;

import main.app.participants.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RJ on 2017-04-06.
 */

public abstract class Course {

    private String courseName;
    private String term;
    private List<Student> students = new ArrayList<>();
}
