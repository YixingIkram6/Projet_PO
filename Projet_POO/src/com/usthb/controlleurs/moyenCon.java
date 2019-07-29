 
package com.usthb.controlleurs;


import com.usthb.modeles.MoyTransport;
import com.usthb.view.autre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

 
public class moyenCon {

    public moyenCon() {
    }
    void ajout(){
        autre a=new autre();
        a.b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String num = null  ;
            int seq = 1;
            String type=a.t1.getSelectedItem().toString(); //recupérer le contenue de comboBox
            long NumSerie=Long.parseLong(a.t2.getText()); //pour convertire le textField string  au variable de type long 
            String matricule=a.t3.getText();
            String modele=a.t4.getText();
            String entreprise=a.t5.getText();
            
            
            MoyTransport moy = new MoyTransport(type+""+seq,NumSerie, matricule, modele, entreprise);
            
            moy.ajouter();
            JOptionPane.showMessageDialog(null, "bien ajouté");   //boite de dialogue
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
}
