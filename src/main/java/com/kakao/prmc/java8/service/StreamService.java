package com.kakao.prmc.java8.service;


import com.kakao.prmc.java8.Application;
import com.kakao.prmc.java8.utiltity.Description;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class StreamService {
    @Description(title = "IntStream, range, boxed, collect, toList")
    public List<Integer> intStream() {
        return
            IntStream
                .range(1, 10)
                .boxed()
                .collect(Collectors.toList());
    }

    @Description(title = "of, collect, toList")
    public List<Integer> of() {
        return
            Stream
                .of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());
    }

    @Description(title = "concat, IntStream, range, boxed, of, collect, toList")
    public List<Integer> concat() {
        return
            Stream.concat(
                IntStream
                    .range(1, 10)
                    .boxed(),
                Stream.of(11, 12, 13)
            ).collect(Collectors.toList());
    }

    @Description(title = "joinning, IntStream, rnage, mapToObject, collect")
    public String joining() {
        return
            IntStream
                .range(0, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("_"));
    }

    @Description(title = "anyMatch, of")
    public boolean anyMatch(String name) {
        return Stream
            .of(Application.CountType.values())
            .anyMatch(x -> x.name().equals(name));
    }

    @Description(title = "reduce, IntStream, rangeClosed")
    public int redcue(int from, int to) {
        return
            IntStream
            .rangeClosed(from, to)
            .reduce(0, (x , y) -> x + y);
    }

    @Description(title = "toArray, IntStream, range")
    public int[] toArray() {
        return
            IntStream
                .range(0, 3)
                .toArray();
    }

    @Description(title = "sorted, of, toArray")
    public int[] sorted() {
        return
            IntStream
                .of(3, 0, 1, 2)
                .sorted()
                .toArray();
    }

    public interface BiConsumer<T, U> {

        /**
         * Performs this operation on the given arguments.
         *
         * @param t the first input argument
         * @param u the second input argument
         */
        void accept(T t, U u);
    }

    @FunctionalInterface
    public interface BinaryOperator<T> extends BiFunction<T,T,T> {
        /**
         * Returns a {@link BinaryOperator} which returns the lesser of two elements
         * according to the specified {@code Comparator}.
         *
         * @param <T> the type of the input arguments of the comparator
         * @param comparator a {@code Comparator} for comparing the two values
         * @return a {@code BinaryOperator} which returns the lesser of its operands,
         *         according to the supplied {@code Comparator}
         * @throws NullPointerException if the argument is null
         */
        public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
            Objects.requireNonNull(comparator);
            return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
        }

        /**
         * Returns a {@link BinaryOperator} which returns the greater of two elements
         * according to the specified {@code Comparator}.
         *
         * @param <T> the type of the input arguments of the comparator
         * @param comparator a {@code Comparator} for comparing the two values
         * @return a {@code BinaryOperator} which returns the greater of its operands,
         *         according to the supplied {@code Comparator}
         * @throws NullPointerException if the argument is null
         */
        public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {
            Objects.requireNonNull(comparator);
            return (a, b) -> comparator.compare(a, b) >= 0 ? a : b;
        }
    }

    @FunctionalInterface
    public interface BiFunction<T, U, R> {

        /**
         * Applies this function to the given arguments.
         *
         * @param t the first function argument
         * @param u the second function argument
         * @return the function result
         */
        R apply(T t, U u);
    }
}
