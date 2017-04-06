package app.courses;

import main.app.participants.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RJ on 2017-04-06.
 */

public interface Course {
    public String getCourseName();
    public String getTerm();
    public List getStudents();
    public List getGroups();

}
