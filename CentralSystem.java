public class CentralSystem {
    
    public static void main(String[] args) {
        
        HelpDeskStation helpDeskStation = HelpDeskStation.getInstance();

        System.out.println("Pag-Ibig Queueing System\n");
        
        helpDeskStation.handleNextCustomer("Help Desk 1");
        helpDeskStation.handleNextCustomer("Help Desk 2");
        helpDeskStation.handleNextCustomer("Help Desk 3");
        helpDeskStation.handleNextCustomer("Help Desk 1");
        helpDeskStation.handleNextCustomer("Help Desk 2");
        helpDeskStation.handleNextCustomer("Help Desk 3");
        helpDeskStation.handleNextCustomer("Help Desk 1");
        helpDeskStation.handleNextCustomer("Help Desk 2");
        helpDeskStation.handleNextCustomer("Help Desk 3");

        System.out.println("");
        
        helpDeskStation.currentQueueNumber();
        System.out.println("");
        helpDeskStation.resetQueueNumber(1);

        System.out.println("");
        helpDeskStation.handleNextCustomer("Help Desk 1");
        helpDeskStation.handleNextCustomer("Help Desk 2");
        helpDeskStation.handleNextCustomer("Help Desk 3");
    }
}

       

    