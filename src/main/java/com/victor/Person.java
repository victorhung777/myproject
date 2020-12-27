package com.victor;

//JAVA 規定如果一個類別沒有繼承任何父類別，它一律繼承java.lang.Object 類別
//建構子：方法名稱與類別名稱相同，且不能有回傳值！
public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height); //Invoke another constructor and must be the fist line here
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello Kitty");
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }
}