package com.telran.org.algorithm_hw_20_11_2023;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int currentFloor;
    private final List<Integer> requests;
    private final List<Integer> stops;
    private boolean isGoingUp;

    public Elevator(int startingFloor, boolean isGoingUp) {
        currentFloor = startingFloor;
        requests = new ArrayList<>();
        stops = new ArrayList<>();
        this.isGoingUp = isGoingUp;
    }

    public void addRequest(int floor) {
        requests.add(floor);
    }

    public void move() {
        while (!requests.isEmpty()) {
            int nextFloor = getNextFloor();
            stops.add(nextFloor);
            requests.remove(Integer.valueOf(nextFloor));
        }
    }

    private int getNextFloor() {
        int nextFloor = currentFloor;
        int minDistance = Integer.MAX_VALUE;
        for (Integer request : requests) {
            int distance = Math.abs(request - currentFloor);
            if (distance < minDistance && isGoingUp == (request > currentFloor)) {
                minDistance = distance;
                nextFloor = request;
            }
        }
        currentFloor = nextFloor;
        if (nextFloor > currentFloor) {
            isGoingUp = true;
        } else isGoingUp = false;
        return nextFloor;
    }

    public List<Integer> getStops() {
        System.out.println("If your floor is 0 to 7 ONE STOP use elevator-1");
        System.out.println("If your floor is 8 to 19 TWO STOPS use elevator-1 IF YOU START FROM 0-7 change to elevator2 TO REACH 8-19");
        return requests;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "currentFloor=" + currentFloor +
                ", requests=" + requests +
                ", stops=" + stops +
                ", isGoingUp=" + isGoingUp +
                '}';
    }
}