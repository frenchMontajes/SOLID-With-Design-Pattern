public class Capstone implements Resource{
    private String capstoneName;

    public Capstone(String capstoneName) {
        this.capstoneName = capstoneName;
    }

    @Override
    public void borrow() {
        System.out.println("A student has taken out details concerning the capstone project named '" + capstoneName + "'.");
    }
}