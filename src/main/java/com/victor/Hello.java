package com.victor;


public class Hello {
    //  Tips: Shortcut,  psvm
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Person p = new Person(80f, 1.7f);
        p.hello();
        p.height = 1.7f;
        p.weight = 80;
        System.out.println(p.bmi());


        // Basic data type
        int age = 19;
        short age_16 = 19;
        long age_64 = 19;
        char char_16 = 'A';
        byte byte_8 = 123;
        float weight_32 = 66.5f;
        double weight_64 = 66.5;
        boolean enrooll = false;

        // Wrapper Class: Build for basic type

        // Reference data type
        String name = "Tom";
        Integer age_2 = 19;
        Character char_obj = 'A';
    }
}
