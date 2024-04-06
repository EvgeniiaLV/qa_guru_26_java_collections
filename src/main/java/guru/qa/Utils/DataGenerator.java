package guru.qa.Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private final Faker faker = new Faker(new Locale("en-GB"));

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String getRandomMobile() {

        return faker.phoneNumber().subscriberNumber(10);

    }

    public String getRandomFullName() {

        return faker.name().fullName();

    }

}
