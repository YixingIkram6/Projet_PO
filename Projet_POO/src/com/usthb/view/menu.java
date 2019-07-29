 
package com.usthb.view;
 
import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import javax.swing.*;

public class menu extends JFrame {
    public JPanel p=new JPanel();
    public JMenuBar m1=new JMenuBar();
    public JMenu mt=new JMenu("Moyen Transport");
    public JMenu chercher=new JMenu(" chercher ");
    public JMenu afficher=new JMenu(" Afficher ");
    public JMenu quit=new JMenu("Quitter ");
    public JMenuItem ex=new JMenuItem(" Exit ");

    public JMenuItem autre=new JMenuItem("  autre  ");
    
    public JMenu avi=new JMenu("  Avion   ");
    public JMenuItem affich=new JMenuItem("la liste  ");
    public JMenuItem saisir=new JMenuItem("ajouter  ");
   
    public menu(){
        add(p);
        this.font1();
          p.add(m1);
          m1.setBounds(0,0,300,50);
          m1.add(mt);
          m1.add(chercher);
          m1.add(afficher);
          m1.add(quit);
          quit.add(ex);
          mt.add(avi);
          avi.add(saisir);
          avi.add(affich);
          mt.add(autre);
          
    }
    public void font1(){
        this.setTitle("Aéroport"); // pour modifier le nom de la fenetre
     	  this.setVisible(true); // modifier la visibilité de la fenetre 
     	  this.setSize(300, 200); // modifier la taille de la fenetre 
     	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* pour fermer la fenetre 
     	                                                       quand on click sur le croix*/
           this.setResizable(false);  //pour la fenetre etre non redimensionnable
     	  p.setLayout(null);
     	  this.setLocationRelativeTo(null);
      }
  
    
    
}
