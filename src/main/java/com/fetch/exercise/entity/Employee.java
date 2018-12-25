package com.fetch.exercise.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by tuanle on 24/12/2018.
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String fullName;

    private String nickName;

    private String title;

    private String company;

    @Email(message = "Not valid email address format")
    private String email;

    private String phoneNumber;

    @NotNull(message = "Date must not null and with the format yyyy-mm-dd")
    private Date birthDay;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDay=" + birthDay +
                ", note='" + note + '\'' +
                '}';
    }
}
