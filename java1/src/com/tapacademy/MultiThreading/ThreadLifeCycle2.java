package com.tapacademy.MultiThreading;

class Kitchen {
    public synchronized void cook(String orderName) {
        try {
            System.out.println(orderName + " is cooking...");
            Thread.sleep(4000);  
            System.out.println(orderName + " cooking done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FoodOrder extends Thread {

    Kitchen kitchen;

    public FoodOrder(Kitchen kitchen, String name) {
        super(name);
        this.kitchen = kitchen;
    }

    @Override
    public void run() {
        System.out.println(getName() + " placed.");
        kitchen.cook(getName());   
        System.out.println(getName() + " delivered.");
    }
}

public class ThreadLifeCycle2 {

    public static void main(String[] args) throws Exception {

        Kitchen kitchen = new Kitchen();

        FoodOrder order1 = new FoodOrder(kitchen, "Order1");
        FoodOrder order2 = new FoodOrder(kitchen, "Order2");

        
        System.out.println("Order1 State: " + order1.getState());

        order1.start();
        order2.start();

        Thread.sleep(1000);  

        System.out.println("Order1 State: " + order1.getState());
        System.out.println("Order2 State: " + order2.getState());

        Thread.sleep(6000);

        
        System.out.println("Order1 State: " + order1.getState());
        System.out.println("Order2 State: " + order2.getState());
    }
}
