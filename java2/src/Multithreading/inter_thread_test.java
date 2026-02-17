package Multithreading;


class PizzaShop {
    boolean pizzaReady = false;

    synchronized void makePizza() throws InterruptedException {
        while (pizzaReady) {
            wait(); // Wait if pizza is already made
        }
        System.out.println("Chef: 🍕 Pizza is ready!");
        pizzaReady = true;
        notify(); // Notify the delivery guy
    }

    synchronized void deliverPizza() throws InterruptedException {
        while (!pizzaReady) {
            wait(); // Wait until pizza is ready
        }
        System.out.println("Delivery Boy: 🚚 Pizza delivered!");
        pizzaReady = false;
        notify(); // Notify the chef to make next pizza
    }
}
public class inter_thread_test {

	public static void main(String[] args) {
		PizzaShop shop = new PizzaShop();

        Thread chef = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    shop.makePizza();
                }
            } catch (InterruptedException e) {}
        });

        Thread deliveryBoy = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    shop.deliverPizza();
                }
            } catch (InterruptedException e) {}
        });

        chef.start();
        deliveryBoy.start();

	}

}
