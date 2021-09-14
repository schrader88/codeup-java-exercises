import java.util.Date;

public class WeatherReading {
    private double latitude;
    private double longitude;
    private Date recordedAt;
    private double tempInCelsius;

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordedAt = recordedAt;
        this.tempInCelsius = tempInKelvin;
    }

    public static double kelvinToCelsius(double tempInKelvin) {
        return tempInKelvin - 273.15;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Date getRecordedAt() {
        return recordedAt;
    }

    public double getTempInCelsius() {
        tempInCelsius = tempInCelsius - 273.15;
        return tempInCelsius;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setRecordedAt(Date recordedAt) {
        this.recordedAt = recordedAt;
    }

    public void setTempInCelsius(double tempInCelsius) {
        this.tempInCelsius = kelvinToCelsius(tempInCelsius);
    }

    public static void main(String[] args) {

        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());

        }
}
