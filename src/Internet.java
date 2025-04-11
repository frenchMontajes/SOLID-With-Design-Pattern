public class Internet implements Resource {
    private String internetAccess;

    public Internet(String internetAccessParam) {
        this.internetAccess = internetAccessParam;
    }

    @Override
    public void borrow() {
        System.out.println(internetAccess + " A student has utilized the URL.");
    }
}