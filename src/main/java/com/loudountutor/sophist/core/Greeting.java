/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

    @JsonProperty
    private String greeting;

    public Greeting() {
    }

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
