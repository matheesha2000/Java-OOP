public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("6754369865");
        AccountTransferEvent eventTwo = new AccountTransferEvent("8769823460");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("3245693256");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}