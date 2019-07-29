 
package com.usthb.controlleurs;

import com.usthb.modeles.Avion;
import com.usthb.view.afficheAvi;
import com.usthb.view.ajouAvion;
import com.usthb.view.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
public class avionCon {
    public static ArrayList<Avion> list = new ArrayList<Avion>();

    public avionCon() {
            
    
    }
        //remplir les tableau avec la liste des produits
    void ajout(){
        ajouAvion a=new ajouAvion();
        a.b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String num = null  ;
            int seq = 1;
            long NumSerie=Long.parseLong(a.t1.getText());
            String modele=a.t2.getText();
            String type=a.c.getSelectedItem().toString();
            String compagnie=a.t3.getText();
            int charge_carburant=Integer.parseInt(a.t5.getText());
            int nbr_voyageurs=Integer.parseInt(a.t6.getText());
            
            Avion av = new Avion(NumSerie,modele,type,compagnie,charge_carburant, nbr_voyageurs);
            
            av.ajouter();
            JOptionPane.showMessageDialog(null, "bien ajouté");
            //seq++;
            
    }});
        a.b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           menuCont m=new menuCont();
           a.setVisible(false);
           
        }
        });
    }
    void affich(){
        afficheAvi af=new afficheAvi();
        af.b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           menuCont m=new menuCont();
           af.setVisible(false);
           
    Avion avv=new Avion();
    
    list=avv.getListe1();
        Object dataProd[] = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            dataProd[0] = list.get(i).getNumero();
            dataProd[1] = list.get(i).getNumSerie();
            dataProd[2] = list.get(i).getModele();
            dataProd[3] = list.get(i).getType();
            dataProd[4] = list.get(i).getCompagnie();
            dataProd[5] = list.get(i).getCharge_carburant();
            dataProd[6] = list.get(i).getNbr_voyageurs();
            af.model1.addRow(dataProd);

    }
        
           
        }
        });
    }
   
    
}
