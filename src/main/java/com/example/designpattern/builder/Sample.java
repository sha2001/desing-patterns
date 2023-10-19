package com.example.designpattern.builder;

import java.time.LocalDate;

public class Sample {
    private final String name;
    private final int value;
    private final LocalDate startDate;
    private final AnotherClass anotherClass;

    /**
     * Creates a new instance of Sample using the provided SampleBuilder.
     *
     * @param builder the SampleBuilder used to construct the Sample instance
     */
    private Sample(SampleBuilder builder) {
        this.name = builder.name;
        this.anotherClass = builder.anotherClass;
        this.startDate = builder.startDate;
        this.value = builder.value;

    }

    public static SampleBuilder builder() {
        return new SampleBuilder();
    }

    public AnotherClass getAnotherClass() {
        return anotherClass;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", startDate=" + startDate +
                ", anotherClass=" + anotherClass +
                '}';
    }

    /**
     * A builder class for constructing instances of the Sample class.
     */
    public static class SampleBuilder {
        private String name;
        private int value;
        private LocalDate startDate;
        private AnotherClass anotherClass;

        public SampleBuilder anotherClass(AnotherClass anotherClass) {
            this.anotherClass = anotherClass;
            return this;
        }

        /**
         * Builds an instance of the Sample class using the current state of the SampleBuilder.
         *
         * @return a new instance of the Sample class
         */
        public Sample build() {
            return new Sample(this);
        }

        /**
         * Sets the name for the SampleBuilder.
         *
         * @param name the name to set
         * @return the SampleBuilder instance
         */
        public SampleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SampleBuilder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public SampleBuilder value(int value) {
            this.value = value;
            return this;
        }

    }
}
