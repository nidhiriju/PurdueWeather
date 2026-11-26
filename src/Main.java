public class Main {
    public static void main(String[] args) {
        //testing to see if profilestorage works
        try {
            ProfileStorage.saveProfile(new Profile("Sarah", 54, 95, 10, 12));
        } catch (java.io.IOException e) {
            System.err.println("Could not save profile: " + e.getMessage());
        }
    }
}