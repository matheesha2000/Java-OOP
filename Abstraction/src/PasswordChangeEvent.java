public class PasswordChangeEvent extends AbstractEvent{

    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " +id + " changeed their password"+
                " Sending a confirmation email to the customer");
    }
}
