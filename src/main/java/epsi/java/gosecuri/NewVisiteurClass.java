/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.java.gosecuri;

import java.sql.Date;

/**
 *
 * @author Fayçal Ziba
 */
public class NewVisiteurClass {
    
    public String _nom;
   public String _prenom;
   public Date _dateVisite;
   //private String _photoVisiteur;
   public int _numeroCarteIdentite;
   
   public NewVisiteurClass (String nom, String prenom, Date dateVisite, int numeroCarteIdentite){
       
   _nom= nom;
    _prenom= prenom;
    _dateVisite=dateVisite;
    _numeroCarteIdentite= numeroCarteIdentite;
   
   }
   }
    

