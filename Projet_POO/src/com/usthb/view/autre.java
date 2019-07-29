 
package com.usthb.view;

import javax.swing.*;
 
public class autre extends JFrame{
    JPanel p1=new JPanel();
    public JLabel l1=new JLabel("Type");
    public JLabel l2=new JLabel("Numéro de série");
    public JLabel l3=new JLabel("Matricule");

    public JLabel l4=new JLabel("Modèle");
    
    public String [] type={"CAM", "BUS", "VOI"};
    public JComboBox t1=new JComboBox(type);
    public JLabel l5=new JLabel("Entreprise");
    
    public JTextField t2=new JTextField();
    public JTextField t3=new JTextField();
    public JTextField t4=new JTextField();
    public JTextField t5=new JTextField();
   
    public JButton b1=new JButton("Enregistrer");
    public JButton b2=new JButton("Retourner");

    public autre() {
        add(p1);
        
        this.font1();
        p1.add(l1);
        l1.setBounds(20, 40, 100, 20);
        p1.add(l2);
        l2.setBounds(20, 80, 100, 20);
        p1.add(l3);
        l3.setBounds(20, 120, 100, 20);
        p1.add(l4);
        l4.setBounds(20, 160, 100, 20);
          p1.add(l5);
        l5.setBounds(20, 200, 200, 20);
       //p.add(l7);
        //l7.setBounds(20, 280, 200, 20);
        p1.add(t1);
        t1.setBounds(150, 40, 200, 20);
        p1.add(t2);
        t2.setBounds(150, 80, 200, 20);
        p1.add(t3);
        t3.setBounds(150, 160, 200, 20);
        p1.add(t4);
       t4.setBounds(150, 120, 200, 20);
        p1.add(t5);
        t5.setBounds(150, 200, 200, 20);
        
        p1.add(b1);
        b1.setBounds(50, 250, 125, 30);
         p1.add(b2);
        b2.setBounds(225, 250, 125, 30);
    }
    public void font1(){
        this.setTitle("Ajouter autre moyen "); // pour modifier le nom de la fenetre
     	  this.setVisible(true); // modifier la visibilité de la fenetre 
     	  this.setSize(400,400); // modifier la taille de la fenetre 
     	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* pour fermer la fenetre 
     	                                                       quand on click sur le croix*/
           this.setResizable(false);
     	  p1.setLayout(null);
     	  this.setLocationRelativeTo(null);
      }
    public static void main (String []args){
        autre con=new autre();
    }
}
