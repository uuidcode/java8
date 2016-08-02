package com.github.uuidcode.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

import com.github.uuidcode.java8.entity.Developer;

public class StreamTest {

    @Test
    public void flatMap() {
        List<Developer> team = new ArrayList<Developer>();

        team.add(
            new Developer()
                .setName("dana")
                .add("clojure")
                .add("scala")
                .add("groovy")
                .add("go"));

        team.add(
            new Developer()
                .setName("ted")
                .add("java")
                .add("javascript"));

        System.out.println(
            team
                .stream()
                .map(Developer::getLanguages)
                .flatMap(l -> l.stream())
                .collect(Collectors.toList()));


        System.out.println(IntStream.of(1, 2).summaryStatistics());
    }
}
