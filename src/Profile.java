public class Profile {
    //private class fields
    private String name;
    private int minTemp;
    private int maxTemp;
    private int maxWind;
    private int maxRain;

    //constructor
    public Profile(String name, int minTemp, int maxTemp, int maxWind, int maxRain) {
        this.name = name;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.maxWind = maxWind;
        this.maxRain = maxRain;
    }

    //getters and setters
    public String getName() {
        return this.name;
    }   

    public int minTemp() {
        return this.minTemp;
    }

    public int maxTemp() {
        return this.maxTemp;
    }

    public int maxWind() {
        return this.maxWind;
    }

    public int maxRain() {
        return this.maxRain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMaxWind(int maxWind) {
        this.maxWind = maxWind;
    }

    public void setMaxRain(int maxRain) {
        this.maxRain = maxRain;
    }
}