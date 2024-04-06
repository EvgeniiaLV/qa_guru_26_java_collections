package guru.qa.Collections;

import guru.qa.Utils.DataGenerator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PhonebookHashmap {
    Logger logger = Logger.getLogger(PhonebookHashmap.class.getName());
    DataGenerator dataGenerator = new DataGenerator();

    private HashMap<String, String> phonebook;

    public PhonebookHashmap(HashMap<String, String> phonebook) {
        this.phonebook = phonebook;
    }

    public void fillHashmapWithRandomValues(HashSet<String> phoneNumbersHashSet) {
        logger.info("Filling the hashmap with random values started");
        for (String mobileNumber : phoneNumbersHashSet) {
            addElement(mobileNumber, dataGenerator.getRandomFullName());
        }
        logger.info("The hashmap is filled");
    }

    public void logValues() {
        for (Map.Entry entry : phonebook.entrySet()) {
            System.out.println(entry);
        }
    }

    public void addElement(String valueMobile, String valueFullName) {
        phonebook.put(valueMobile, valueFullName);
        logger.info("Element with key " + valueMobile + " added to the hashmap");
    }

    public void removeElement(String key) {
        phonebook.remove(key);
        logger.info("Element with key " + key + " removed from the hashmap");
    }

    public void searchElementByValue(String value) {
        logger.info("Searching in the hashmap started");
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                logger.info("The following name found: " + value);
                return;
            }
        }
        logger.info("Nothing found");
    }
}

