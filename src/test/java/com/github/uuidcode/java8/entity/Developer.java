package com.github.uuidcode.java8.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Developer {
    private String name;
    private Set<String> languages = new LinkedHashSet<String>();

    public Set<String> getLanguages() {
        return this.languages;
    }

    public Developer setLanguages(Set<String> languages) {
        this.languages = languages;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Developer setName(String name) {
        this.name = name;
        return this;
    }

    public Developer add(String language) {
        this.languages.add(language);
        return this;
    }
}
