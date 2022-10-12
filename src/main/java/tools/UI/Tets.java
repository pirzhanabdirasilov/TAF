package tools.UI;

import com.github.javafaker.Faker;

public class Tets {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.number().randomNumber(10,true));
        System.out.println(faker.internet().image());
    }
}
