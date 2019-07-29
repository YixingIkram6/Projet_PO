 
package com.usthb.controlleurs;

import com.usthb.view.autre;
import com.usthb.view.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class menuCont {

    public menuCont() {
        menu m=new menu();
        m.saisir.addActionListener(new  ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          avionCon c=new avionCon();
          c.ajout();
        }
        });
        m.affich.addActionListener(new  ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          avionCon c=new avionCon();
          c.affich();
        }
        });
        m.autre.addActionListener(new  ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          moyenCon a=new moyenCon();
          a.ajout();
        }
        });
        m.ex.addActionListener(new  ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m.dispose();   //pour quitter l'app
        }});
    }
     public static void main (String []args){
        menuCont con=new menuCont();
    }
}
