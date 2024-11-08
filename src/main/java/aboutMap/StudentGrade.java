package main.java.aboutMap;

import java.util.Objects;

//StudentGrade sınıfını Map’te anahtar olarak tanımlamak için kuruyoruz
public class StudentGrade {
    private final int studentId;
    private final String subject;

    public StudentGrade(int studentId, String subject) {
        this.studentId = studentId;
        this.subject = subject;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public int hashCode(){
        return Objects.hash(studentId, subject);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return studentId == that.getStudentId() && Objects.equals(subject, that.subject);
    }
}
