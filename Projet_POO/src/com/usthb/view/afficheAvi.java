 
package com.usthb.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
public class afficheAvi extends JFrame {
    public JPanel p=new JPanel();
    
   public JTable av=new JTable();
   public JScrollPane pan;
   public DefaultTableModel model1= (DefaultTableModel) av.getModel();
   public JButton b2=new JButton("Retourner");

  public afficheAvi() {
        add(p);
        this.font1();
       
                  /*------ create scroll pane  pour affichage ----*/
                   String [] column ={"num Séquentiel", "num de série", " modele"," type","compagnie"," charge_carburant","nbr_voyageurs"};
                   model1.setColumnIdentifiers(column);
                   av.setModel(model1);
	           pan=new JScrollPane(av);
             
                pan.setBounds(40, 20, 520, 200);
                p.add(pan);
                p.add(b2);
                b2.setBounds(400, 225, 125, 30);
                
        
    }
    
    public void font1(){
        this.setTitle("Affichage de liste des Avion"); // pour modifier le nom de la fenetre
     	  this.setVisible(true); // modifier la visibilité de la fenetre 
     	  this.setSize(600,300); // modifier la taille de la fenetre 
     	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* pour fermer la fenetre 
     	                                                       quand on click sur le croix*/
           this.setResizable(false);  //pour la fenetre etre non redimensionnable
     	  p.setLayout(null);
     	  this.setLocationRelativeTo(null);
      }
    
    
    
}
