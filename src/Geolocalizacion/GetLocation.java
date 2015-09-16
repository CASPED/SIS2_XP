package Geolocalizacion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;

public class GetLocation extends Thread{
    
    String mcc  = "736";//el código de país móvil
    String mnc  = "002";//el código de red móvil
    String lac  = "43401";//ubicación código de área
    String cellid="13796389";//CellID
    String url;
    String latitude="";
    String longitude="";
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
            //Thread t=new Thread(this);
            //t.start();
        System.out.println ("Requesting position...");
        }
    }
    
    public void run(){		    
        try {		      
            URL obj = new URL(url);		      
            HttpURLConnection cnx = (HttpURLConnection)obj.openConnection();

            InputStream leer=cnx.getInputStream();
            System.out.println(leer);//+
            
            StringBuffer destino=new StringBuffer();

            int car;		      
            while( (car=leer.read())!= -1){		        
                destino.append((char)car);		      
            }		
            //System.out.println(destino);//+
            leer.close();		     
            cnx.disconnect();            		     
            
            String res=destino.toString();
            //System.out.println(res);//+
            
            if(res.startsWith("err")){		       
                System.out.println ("not found!");		     
            } else {		       
                int pos=res.indexOf(',');		       
                latitude=res.substring(0,pos);

                int pos2=res.indexOf(',',pos+1);		       
                longitude=res.substring(pos+1,pos2);	           
            }
        } catch (IOException ex) {		 
            ex.printStackTrace();	
            System.out.println (ex.toString());	
        }
        System.out.println("Latitud " + latitude);                    
        System.out.println("Longitud " + longitude);
    }
    
    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
