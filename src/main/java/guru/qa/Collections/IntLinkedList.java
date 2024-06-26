package guru.qa.Collections;

import guru.qa.Utils.DataGenerator;
import guru.qa.Utils.TestData;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class IntLinkedList {
    private final List<Integer> integerList;
    Logger logger = Logger.getLogger(IntLinkedList.class.getName());
    DataGenerator dataGenerator = new DataGenerator();

    public IntLinkedList() {
        this.integerList = new LinkedList<>();
    }

    public void fillLinkedListWithRandomIntValues(int length) {
        logger.info("Filling the linked list with random values");
        int i = 0;
        while (i < length) {
            addElement(dataGenerator.getRandomNumber(TestData.MIN_INT_BORDER,
                    TestData.MAX_INT_BORDER), i);
            ++i;
        }
        logger.info("The linked list is filled");
    }

    public void logValues() {
        for (int i = 0; i < integerList.size(); i++) {
            logger.info("id:" + i + ", value:" + integerList.get(i));
        }
    }

    public void searchElementByValue(int searchValue) {
        logger.info("Searching value " + searchValue + " in the linked list started");
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) == searchValue) {
                logger.info("Element " + searchValue + " found");
                return;
            }
        }
        logger.info("Value " + searchValue + " wasn't found in the linked list");
    }

    public void addElement(int newValue, int index) {
        integerList.add(index, newValue);
        logger.info("Value " + newValue + " added to the linked list");
    }

    public void removeElementByIndex(int index) {
        logger.info("Element removing started, current list size is " + integerList.size());
        integerList.remove(index);
        logger.info("Element with index " + index + " removed, current list size is " + integerList.size());
    }
}