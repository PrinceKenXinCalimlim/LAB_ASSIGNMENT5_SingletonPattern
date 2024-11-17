public class HelpDeskStation {
    private static HelpDeskStation instance;
    private int queueNumber = 1; 

   
    private HelpDeskStation() {

    }
    public static synchronized HelpDeskStation getInstance() {
        if (instance == null) 
            instance = new HelpDeskStation();
        
        return instance;
    }


    public synchronized void currentQueueNumber() {
        System.out.println("Current Queue Number: " + queueNumber);
    }

    public synchronized void handleNextCustomer(String helpDesk) {
        System.out.println(helpDesk + " is handling customer number: " + queueNumber);
        queueNumber++;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        queueNumber = newQueueNumber;
        System.out.println("Queue number reset to: " + queueNumber);
    }
}    