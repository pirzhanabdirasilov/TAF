package tools.UI.configReader;

import com.github.javafaker.Faker;

public class MockGeneratorData {
    private static final Faker faker = new Faker();


    public static String generatorMockFirstName(){
       return faker.name().firstName();
    }
    public static String generatorMockLastName(){
        return faker.name().lastName();
    }
    public static String generatorMockEmail(){
        return faker.internet().emailAddress();
    }
    public static String generatorMockNumber(){
        return String.valueOf(faker.number().randomNumber(10,true));
    }
    public static String generatorMockImg(){
        return faker.internet().image();
    }
    public static String generatorMockAddress(){
        return faker.internet().macAddress();

    }

}
