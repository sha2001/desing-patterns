package com.example.designpattern.creational.builder;

public class AnotherClass {
    private final String anotherString;
    private final int anInt;


    private AnotherClass(AnotherClassBuilder anotherClassBuilder) {
        this.anotherString = anotherClassBuilder.anotherString;
        this.anInt = anotherClassBuilder.anInt;
    }

    public static AnotherClassBuilder builder() {
        return new AnotherClassBuilder();
    }

    public int getAnInt() {
        return anInt;
    }

    public String getAnotherString() {
        return anotherString;
    }

    @Override
    public String toString() {
        return "AnotherClass{" +
                "anotherString='" + anotherString + '\'' +
                ", anInt=" + anInt +
                '}';
    }

    public static class AnotherClassBuilder {
        private String anotherString;
        private int anInt;

        public AnotherClassBuilder anInt(int anInt) {
            this.anInt = anInt;
            return this;
        }

        public AnotherClassBuilder anotherString(String anotherString) {
            this.anotherString = anotherString;
            return this;
        }

        public AnotherClass build() {
            return new AnotherClass(builder());
        }

    }


}
