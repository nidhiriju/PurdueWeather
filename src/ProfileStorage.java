import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfileStorage {
    private static final String PATH = "data/profiles.csv";

    public static void saveProfile(Profile profile) throws IOException {

        if (profile.getName().contains(",")) {
            throw new IllegalArgumentException("Profile name cannot contain a comma.");
        }

        new File(PATH).getParentFile().mkdirs();

        try (PrintWriter pw = new PrintWriter(new FileOutputStream(PATH, true))) {
            pw.println(profile.getName() + ","
                    + profile.minTemp() + ","
                    + profile.maxTemp() + ","
                    + profile.maxWind() + ","
                    + profile.maxRain());
        }
    }
}