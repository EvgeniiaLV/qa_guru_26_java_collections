package guru.qa.Collections;

import guru.qa.Utils.DataGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class PhoneNumbersHashSet {
    Logger logger = Logger.getLogger(PhoneNumbersHashSet.class.getName());
    DataGenerator dataGenerator = new DataGenerator();
    private HashSet<String> phoneNumbers;

    public PhoneNumbersHashSet(HashSet<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void fillHashSet(int length) {
        logger.info("Filling the hashset with random values started");
        int i = 1;
        do {
            addElement(dataGenerator.getRandomMobile());
            ++i;
        } while (i < length);
        logger.info("The hashset is filled");
    }

    public void logValues() {
        Iterator<String> i = phoneNumbers.iterator();
        while (i.hasNext())
            logger.info(i.next());
    }

    public void addElement(String key) {
        phoneNumbers.add(key);
        logger.info("Element with key " + key + " added to the hashset");
    }

    public void removeElement(String key) {
        phoneNumbers.remove(key);
        logger.info("Element with key " + key + " removed from the hashset");
    }

    public void searchElement(String value) {
        if (phoneNumbers.contains(value)) {
            for (String mobileNumber : phoneNumbers) {
                if (mobileNumber.equals(value))
                    logger.info(value + " found in the hashset");
                return;
            }
        }
        logger.info(value + " wasn't found in the hashset");
        return;
    }

    public HashSet<String> getHashSet() {
        return phoneNumbers;
    }
}
