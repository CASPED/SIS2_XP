
package Transporte;

public class Coordinates {
    private double latitude; //in decimal degrees.
    private double longitude; //in decimal degrees.

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordinates(String latitude, String longitude) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

   public void setLatitude(double latitude) {
        this.latitude = latitude;
   }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}