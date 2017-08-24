package com.loudountutor.sophist.views;

import com.loudountutor.sophist.model.Student;

public class StudentView extends BaseView {
    private final Student student;

    public StudentView(Student student) {
        super("profileView.ftl");
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

}
