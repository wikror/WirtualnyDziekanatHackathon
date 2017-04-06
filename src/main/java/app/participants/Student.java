package app.participants;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wikto on 06.04.2017.
 */
@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "PESEL")
    private String Pesel;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Surname")
    private String Surname;

    @Column(name = "Gender")
    private String Gender;

    public String getPesel() {
        return Pesel;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getGender() {
        return Gender;
    }

    public Student(String pesel, String name, String surname, String gender) {
        Pesel = pesel;
        Name = name;
        Surname = surname;
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "PESEL=" + Pesel +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

}
