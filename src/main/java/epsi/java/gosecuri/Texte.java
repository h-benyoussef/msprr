/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.java.gosecuri;

/**
 *
 * @author mmf
 */
public class Texte {
    
    private String contenu;

    public Texte(String contenu) {
        this.contenu = contenu;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Texte{" + "contenu=" + contenu + '}';
    }
    
    
    
}
