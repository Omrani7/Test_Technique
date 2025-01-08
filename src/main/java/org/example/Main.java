package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
     String pathFichier = "C:\\Users\\moham\\Downloads\\document.txt";
     try{
         File file = new File(pathFichier);
         BufferedReader br = new BufferedReader(new FileReader(file));
         String ligne ;
         int nbrEtalonnageTotal = 0;
         while((ligne = br.readLine())!=null) {
             String nbrEtalonnage = nbrEtalonnage(ligne);
             if(nbrEtalonnage !=null){
                 nbrEtalonnageTotal+=Integer.parseInt(nbrEtalonnage);
             }
         }
         br.close();
         System.out.println(" la somme de toutes les valeurs d'étalonnage :  "+nbrEtalonnageTotal);
     }catch (IOException e){
         System.out.println("erreur : "+e.getMessage());
     }
    }
    private  static  String nbrEtalonnage( String ligne){

        Character premierNbr = null;
        Character dernierNbr = null;

     for (int i = 0; i<ligne.length();i++){
         char c  = ligne.charAt(i);
           if (Character.isDigit(c)){
               if (premierNbr == null){
                   premierNbr = c;
               }
           dernierNbr = c;
           }
     }
     if (premierNbr != null && dernierNbr!= null){
         return ""+ premierNbr+dernierNbr;
     }
     return null;
    }
}