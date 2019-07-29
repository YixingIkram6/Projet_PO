  
package com.usthb.view;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class ajouAvion extends JFrame{
    JPanel p=new JPanel();
    public JLabel l1=new JLabel("Numéro de série");
    //public JLabel l2=new JLabel("Matricule");
    public JLabel l3=new JLabel("Modèle");
    public JLabel l4=new JLabel("Type");
    public String [] type={"AIRBUS", "BOEING", "ATR"};
    public JComboBox c=new JComboBox(type);
    public JLabel l5=new JLabel("Companie");
    public JLabel l6=new JLabel("Charge en Cutburant");
    public JLabel l7=new JLabel("nombre de voyageurs");
    public JTextField t1=new JTextField();
    public JTextField t2=new JTextField();
    public JTextField t3=new JTextField();
    public JTextField t5=new JTextField();
    public JTextField t6=new JTextField();
    public JTextField t7=new JTextField();
    public JButton b1=new JButton("Enregistrer");
    public JButton b2=new JButton("Retourner");

    public ajouAvion() {
        add(p);
        this.font1();
        p.add(l1);
        l1.setBounds(20, 40, 100, 20);
        p.add(l3);
        l3.setBounds(20, 80, 100, 20);
        p.add(l4);
        l4.setBounds(20, 120, 100, 20);
        p.add(l5);
        l5.setBounds(20, 160, 100, 20);
         p.add(l6);
        l6.setBounds(20, 200, 200, 20);
        p.add(l7);
        l7.setBounds(20, 240, 200, 20);
       //p.add(l7);
        //l7.setBounds(20, 280, 200, 20);
        p.add(t1);
        t1.setBounds(150, 40, 200, 20);
        p.add(t2);
        t2.setBounds(150, 80, 200, 20);
        p.add(t3);
        t3.setBounds(150, 160, 200, 20);
        p.add(c);
        c.setBounds(150, 120, 200, 20);
        p.add(t5);
        t5.setBounds(150, 200, 200, 20);
        p.add(t6);
        t6.setBounds(150, 240, 200, 20);
        //p.add(t7);
        //t7.setBounds(150, 280, 200, 20);
        p.add(b1);
        b1.setBounds(50, 300, 125, 30);
         p.add(b2);
        b2.setBounds(225, 300, 125, 30);
        
    }
    
    public void font1(){
        this.setTitle("Ajouter Avion"); // pour modifier le nom de la fenetre
     	  this.setVisible(true); // modifier la visibilité de la fenetre 
     	  this.setSize(400,500); // modifier la taille de la fenetre 
     	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* pour fermer la fenetre 
     	                                                       quand on click sur le croix*/
           this.setResizable(false);
     	  p.setLayout(null);
     	  this.setLocationRelativeTo(null);
      }
    public static void main( String[] args){
        ajouAvion a= new ajouAvion();
        //a.setVisible(true);
         
    }
    
}
