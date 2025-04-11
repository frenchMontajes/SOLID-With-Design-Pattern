public class Journal implements Resource{
    private String journalName;

    public Journal(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void borrow() {
        System.out.println("A student has taken out the journal titled '" + journalName + '"');

    }
}