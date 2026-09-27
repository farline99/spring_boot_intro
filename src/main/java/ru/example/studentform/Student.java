package ru.example.studentform;

import java.util.Locale;

public class Student {
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private int admissionYear;

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getGroup() {
        return String.format(Locale.ROOT, "ПИНз-1%02d", admissionYear % 100);
    }

    public String getLogin() {
        return "student-" + getGroup().toLowerCase(Locale.ROOT).replace("-", "") + "-" + id;
    }
}
