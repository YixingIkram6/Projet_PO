 
package com.usthb.modeles;

import static com.usthb.modeles.Avion.list1;
import java.util.ArrayList;

 
public class MoyTransport {
    String numero;
private int sequentiel;
long NumeroSerie;
String maticule;
String modele;
String EntrProp; // l’aéroport ou un prestataire extérieur.
static int cpt=1;
public static ArrayList<MoyTransport> list= new ArrayList<MoyTransport>();

    public MoyTransport(String numero,long NumeroSerie,String matricule,String modele,String EntrProp){
	this.sequentiel=cpt;
	this.numero=numero+""+sequentiel;
	this.NumeroSerie=NumeroSerie;
	this.maticule=matricule;
	this.modele=modele;
	this.EntrProp=EntrProp;
	cpt++;
	 
  }


public String getNumero() {
	return numero;
}
 
public long getNumeroSerie() {
	return NumeroSerie;
}
 
public String getMaticule() {
	return maticule;
}
 
public String getModele() {
	return modele;
}
 
public String getEntrProp() {
	return EntrProp;
}
 
public void ajouter(){
            System.out.println(getNumero());
            list.add(this);
            
                        System.out.println(list.size());
                        System.out.println(list);
                        

        }

}
