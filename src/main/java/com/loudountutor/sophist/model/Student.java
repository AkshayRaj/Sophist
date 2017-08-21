package com.loudountutor.sophist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.slf4j.Logger;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@JsonDeserialize(builder = Student.Builder.class)
public class Student {

    private Long id;

    @NotNull
    @Size(min = 2, max = 64)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 64)
    private String lastName;

    @NotNull
    private Date dateOfBirth;

    @NotNull
    @Size(min = 2, max = 255)
    private String email;

    @Size(min = 10, max = 20)
    private String phone;

    private String password;

    private Student(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.email = builder.email;
        this.phone = builder.phone;
        this.password = builder.password;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    @JsonPOJOBuilder(withPrefix = "set")
        public static class Builder{
            private long id;

            @NotNull
            @Size(min = 2, max = 64)
            private String firstName;

            @NotNull
            @Size(min = 2, max = 64)
            private String lastName;

            private Date dateOfBirth;

            @NotNull
            @Size(min = 2, max = 64)
            private String email;

            @Size(min = 10, max = 14)
            private String phone;

            @NotNull
            @Size(min = 8, max = 64)
            private String password;

            public Builder setId(Long id) {
                this.id = id;
                return this;
            }

            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder setDateOfBirth(Date dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
                return this;
            }

            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public Builder setPhone(String phone) {
                this.phone = phone;
                return this;
            }

            public Builder setPassword(String password) {
                this.password = password;
                return this;
            }

            public Student build(){
                return new Student(this);
            }
        }
    }
