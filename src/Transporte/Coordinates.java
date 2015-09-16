
package Transporte;

public class Coordinates {
    public static double latitude; //in decimal degrees.
    public static double longitude; //in decimal degrees.
    
    public Coordinates() {
        
    }

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
        System.out.println("Latitud Guardada: "+latitude);
        return latitude;
    }

    public double getLongitude() {
        System.out.println("Longitud Guardada: "+longitude);
        return longitude;
  
    }
}