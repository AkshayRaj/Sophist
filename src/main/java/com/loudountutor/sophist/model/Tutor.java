/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Tutor {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private long id;

    @NotNull
    @Size(min = 2, max = 64)
    @JsonProperty
    private String name;

    @NotNull
    @Size(min = 2, max = 16)
    @JsonProperty
    private String login;

    @NotNull
    @Size(min = 2, max = 16)
    @JsonProperty
    private String password;

    public Tutor() {
    }

    public Tutor(long id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
