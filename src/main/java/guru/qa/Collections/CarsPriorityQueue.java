package guru.qa.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.logging.Logger;

public class CarsPriorityQueue {
    Logger logger = Logger.getLogger(CarsPriorityQueue.class.getName());
    private PriorityQueue<String> carsPriorityQueue;
    private Iterator iterator;

    public CarsPriorityQueue() {
        this.carsPriorityQueue = new PriorityQueue<>();
    }

    public void fillPriorityQueue() {
        logger.info("Filling the priority queue started");
        addElement("Lamborghini Veneno");
        addElement("Audi R8");
        addElement("Ferrari F40");
        addElement("McLaren Speedtail");
        addElement("Aston Martin Valkyrie");
        addElement("Lamborghini Sian");
        addElement("Pagani Huayra");
        logger.info("The hashmap is filled");
    }

    public void addElement(String value) {
        carsPriorityQueue.add(value);
        logger.info(value + " added to the priority queue");
    }

    public void removeElement(String value) {
        carsPriorityQueue.remove(value);
        logger.info(value + " removed from the priority queue");
    }

    public void searchElementByValue(String value) {
        iterator = carsPriorityQueue.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().toString().equalsIgnoreCase(value)) {
                logger.info(value + " found in the priority queue");
                return;
            }
        }
        logger.info(value + " wasn't found in the priority queue");
    }

    public void logValues() {
        iterator = carsPriorityQueue.iterator();

        while (iterator.hasNext()) {
            logger.info(iterator.next().toString());
        }
    }
}

