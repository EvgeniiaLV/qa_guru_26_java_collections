package guru.qa;

import guru.qa.Collections.CarsPriorityQueue;
import guru.qa.Collections.IntLinkedList;
import guru.qa.Collections.PhoneNumbersHashSet;
import guru.qa.Collections.PhonebookHashmap;
import guru.qa.Utils.TestData;

import java.util.*;

public class Main {
    private static int length;
    private static int middle;

    public static void main(String[] args) {
        length = getLength();
        middle = (length > 1 ? length / 2 - 1 : 0);

        executeBasicLinkedListFunctionality();
        executeBasicHashSetAndHashMapFunctionality();
        executeBasicPriorityQueueFunctionality();
    }

    private static int getLength() {
        Scanner console = new Scanner(System.in);
        System.out.println("The program executes simple actions with 4 collections:");
        System.out.println("Linked list");
        System.out.println("Hash set");
        System.out.println("Hash map");
        System.out.println("Priority queue");
        System.out.println();
        System.out.println();
        System.out.println("Please insert length for data collections");

        return console.nextInt();
    }

    private static void executeBasicLinkedListFunctionality() {
        IntLinkedList intLinkedList = new IntLinkedList(new LinkedList<>());
        intLinkedList.fillLinkedListWithRandomIntValues(length);
        intLinkedList.addElement(TestData.LINKED_LIST_TEST_VALUE1, middle);
        intLinkedList.addElement(TestData.LINKED_LIST_TEST_VALUE2, middle);
        intLinkedList.searchElementByValue(TestData.LINKED_LIST_TEST_VALUE1);
        intLinkedList.removeElementByIndex(middle);
        intLinkedList.logValues();
    }

    private static void executeBasicHashSetAndHashMapFunctionality() {
        PhoneNumbersHashSet phoneNumbersHashSet = new PhoneNumbersHashSet(new HashSet<String>());
        phoneNumbersHashSet.fillHashSet(length);
        phoneNumbersHashSet.addElement(TestData.HASH_SET_MOBILE_NUMBER1);
        phoneNumbersHashSet.addElement(TestData.HASH_SET_MOBILE_NUMBER2);
        phoneNumbersHashSet.searchElement(TestData.HASH_SET_MOBILE_NUMBER2);
        phoneNumbersHashSet.removeElement(TestData.HASH_SET_MOBILE_NUMBER1);
        phoneNumbersHashSet.logValues();

        PhonebookHashmap phonebookHashMap = new PhonebookHashmap(new HashMap<>());
        phonebookHashMap.fillHashmapWithRandomValues(phoneNumbersHashSet.getHashSet());
        phonebookHashMap.addElement(TestData.HASH_MAP_MOBILE_NUMBER, TestData.HASH_MAP_FULL_NAME);
        phonebookHashMap.searchElementByValue(TestData.HASH_MAP_FULL_NAME);
        phonebookHashMap.removeElement(TestData.HASH_SET_MOBILE_NUMBER2);
        phonebookHashMap.logValues();
    }

    public static void executeBasicPriorityQueueFunctionality() {
        CarsPriorityQueue carsPriorityQueue = new CarsPriorityQueue(new PriorityQueue<>());
        carsPriorityQueue.fillPriorityQueue();
        carsPriorityQueue.addElement(TestData.PRIORITY_QUEUE_TEST_CAR_NAME);
        carsPriorityQueue.searchElementByValue(TestData.PRIORITY_QUEUE_TEST_CAR_NAME);
        carsPriorityQueue.removeElement(TestData.PRIORITY_QUEUE_TEST_CAR_NAME);
        carsPriorityQueue.logValues();
    }
}