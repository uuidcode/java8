package com.github.uuidcode.java8.optional;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {
    public static class Project {
        private Episode episode;

        public Episode getEpisode() {
            return this.episode;
        }

        public Project setEpisode(Episode episode) {
            this.episode = episode;
            return this;
        }
    }

    public static class Episode {
        private String name;

        public String getName() {
            return this.name;
        }

        public Episode setName(String name) {
            this.name = name;
            return this;
        }
    }

    @Test
    public void test1() {
        Project project = null;
        Optional<Project> projectOptional = Optional.ofNullable(project);
        Optional<String> episodeName =
            projectOptional
                .map(Project::getEpisode)
                .map(Episode::getName);

        assertThat(episodeName.orElse(null), is(nullValue()));
    }

    @Test
    public void test2() {
        Project project = new Project().setEpisode(new Episode().setName("test"));
        Optional<Project> projectOptional = Optional.ofNullable(project);

        Optional<String> episodeName =
            projectOptional
                .map(Project::getEpisode)
                .map(Episode::getName);

        assertThat(episodeName.orElse(""), is("test"));
    }

    @Test
    public void test3() {
        Project project = new Project().setEpisode(new Episode().setName("test"));
        String episodeName = "";

        if (project != null) {
            Episode episode = project.getEpisode();
            if (episode != null) {
                episodeName = episode.getName();
            }
        }

        assertThat(episodeName, is("test"));
    }
}
