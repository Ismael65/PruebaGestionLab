
package pruebagestionlab;


import java.io.*;
import java.io.File;


public class LeerArchivoBuffered {
    
    public LeerArchivoBuffered() {
    
        
        BufferedReader almacenamiento;
        String cadena;
      try {
          almacenamiento = new BufferedReader(new java.io.FileReader("ListaPrecio.txt"));
          cadena="";
          while (cadena!=null) {
              cadena = almacenamiento.readLine();
              System.out.println(cadena);    
          }
          almacenamiento.close();
          }
      catch(Exception e){
         e.printStackTrace();
      }finally{
        try{ 
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
  

    }

    public static void main(String ars[]){
        new LeerArchivoBuffered();
    }

    /*private BufferedInputStream BufferedInputStream(pruebagestionlab.FileReader fr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

}
