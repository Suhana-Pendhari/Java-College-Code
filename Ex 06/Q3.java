public class Q3 {
    public static void main(String[] args) {
        String userName = null;
        String name = "Suhana";

        try {
            String Name = name.toUpperCase();
            System.out.println("User name: " + Name);
            String upperName = userName.toUpperCase();
            System.out.println("User name in uppercase: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Error: User name is not set.");
        }
    }
}
