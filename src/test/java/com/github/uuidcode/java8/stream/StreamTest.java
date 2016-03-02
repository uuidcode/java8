package com.github.uuidcode.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.github.uuidcode.java8.entity.Developer;

public class StreamTest {
    @Test
    public void flatMap() {
        List<Developer> team = new ArrayList<Developer>();
        Developer polyglot =
            new Developer()
                .setName("esoteric")
                .add("clojure")
                .add("scala")
                .add("groovy")
                .add("go");

        team.add(polyglot);

        Developer busy =
            new Developer()
                .add("java")
                .add("javascript");

        team.add(busy);

        System.out.println(
            team
                .stream()
                .map(Developer::getLanguages)
                .flatMap(l -> l.stream())
                .collect(Collectors.toList()));

    }
}
