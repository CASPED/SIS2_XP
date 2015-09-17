
package Transporte;

public class Coordinates {
    public static String latitude;
    public static String longitude;
    
    public Coordinates() {
        
    }

    public Coordinates(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

   public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

   public void setLatitude(String latitude) {
        this.latitude = latitude;
   }

    public String getLatitude() {
        System.out.println("***** Latitud Guardada: "+latitude);
        return latitude;
    }

    public String getLongitude() {
        System.out.println("***** Longitud Guardada: "+longitude);
        return longitude;
  
    }
}