package Geolocalizacion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;

public class GetLocation extends Thread{
    
    String mcc  = "736";
    String mnc  = "002";
    String lac  = "43401";
    String cellid="13796389";
    String url;
    public String latitude="";
    public String longitude="";
    private Object Connector;
    
    public GetLocation(){
                
    }
    
    public static void main (String[] args){
        GetLocation movil=new GetLocation();
        movil.iniciar();
        movil.start();
    }
    
    public void iniciar(){
	if(cellid!=null){
            String info="- CELL-ID:"+cellid+" MCC:"+mcc+" MNC:"+mnc+" LAC:"+lac;
            url="http://opencellid.org/#action=locations.cell&mcc=" + mcc
                    + "&mnc=" + mnc
                    + "&lac=" + lac 
                    + "&cellid=" +cellid 
                    + "&fmt=txt";
            System.out.println (info);
            Thread t=new Thread(this);
            t.start();
        System.out.println ("Requesting position...");
        }
    }
    
    @Override
    public void run(){		    
        try {		      
            URL obj = new URL(url);		      
            HttpURLConnection cnx = (HttpURLConnection)obj.openConnection();

            StringBuffer destino;
            try (InputStream leer = cnx.getInputStream()) {
                //System.out.println(leer);//+
                destino = new StringBuffer();
                int car;
                while( (car=leer.read())!= -1){
                    destino.append((char)car);
                }
            } 
            cnx.disconnect();            		     
            
            String res=destino.toString();
            
            if(res.startsWith("err")){		       
                System.out.println ("not found!");		     
            } else {		       
                int pos=res.indexOf(',');		       
                latitude=res.substring(0,pos);

                int pos2=res.indexOf(',',pos+1);		       
                longitude=res.substring(pos+1,pos2);	           
            }
        } catch (IOException ex) {		 
            System.out.println (ex.toString());	
        }
    }
    
    public String getLatitude() {
        System.out.println("***** Latitud Conseguida GEO: "+latitude+(-17.385505));
        return latitude+(-17.385505);
    }

    public String getLongitude() {
        System.out.println("***** Latitud Conseguida GEO: "+longitude+(-66.146412));
        return longitude+(-66.146412);
    }
}
