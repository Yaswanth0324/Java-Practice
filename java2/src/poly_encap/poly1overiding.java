package poly_encap;

class Notification {
    void notifyUser() {
        System.out.println("Sending generic notification");
    }
}

class EmailNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
class watsappNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending WATSAPP Notification");
    }
}
public class poly1overiding {
	public static void main(String[] args) {
		Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();
        Notification n4 = new watsappNotification();

        n1.notifyUser(); 
        n2.notifyUser(); 
        n3.notifyUser(); 
        n4.notifyUser();
		
	}
}
