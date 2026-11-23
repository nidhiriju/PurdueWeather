public class Main {
    public static void main(String[] args) {
        //testing to see if profile class works
        Profile newProfile = new Profile("Sarah", 54, 95, 10, 12);
        newProfile.setName("Bob");
        IO.println(newProfile.getName());
    }
}