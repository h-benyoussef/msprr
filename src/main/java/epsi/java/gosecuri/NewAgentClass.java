/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.java.gosecuri;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fayçal Ziba
 */
public class NewAgentClass {
    
   public String _nom;
   public String _prenom;
   public int _estAdmin;
   public Date _dateNaissance;
   public String _posteAgent;
   //private String _photoAgent;
   public int _numeroCarteIdentite;
   
   public NewAgentClass(String nom, String prenom, int estAdmin, Date dateNaissance, String posteAgent, int numeroCarteIdentite){
   
    _nom= nom;
    _prenom= prenom;
    _estAdmin=estAdmin;
    _dateNaissance=dateNaissance;
    _posteAgent=posteAgent;
    _numeroCarteIdentite= numeroCarteIdentite;
   
   
   
   }

    NewAgentClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public boolean CheckIfAdmin(){
       //tester si l'agent est admin ou pas
       
       return true;
   }
           
   
   
    
        
       /* Scanner sc= new Scanner(System.in);
        recupNom=sc.nextLine();*/
    
}
