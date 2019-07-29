 
package com.usthb.modeles;

import java.util.ArrayList;
import java.util.List;
 
public class Avion {
   String numero = "AVI";
	String num;
        public int sequentiel;
	long NumSerie;
	String modele;
	String type;
	String compagnie;
	int charge_carburant;
	int nbr_voyageurs;
	public static ArrayList<Avion> list1 = new ArrayList<Avion>();
	public Avion(long NumSerie,String modele,String type,String compagnie,int charge_carburant,int nbr_voyageurs){
		
		this.num=numero+""+sequentiel;
		this.NumSerie=NumSerie;
		this.modele=modele;
		this.type=type;
		this.compagnie=compagnie;
	        this.charge_carburant=charge_carburant;
	        this.nbr_voyageurs=nbr_voyageurs;
	        sequentiel=sequentiel+1;
		  
	}

    public Avion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	

	public String getNumero() {
		return numero;
	}

	public long getNumSerie() {
		return NumSerie;
	}
 
	public String getModele() {
		return modele;
	}

	 
	public String getType() {
		return type;
	}

	 

	public String getCompagnie() {
		return compagnie;
	}
 
	public int getCharge_carburant() {
		return charge_carburant;
	}

	public int getNbr_voyageurs() {
		return nbr_voyageurs;
	}
 
	public void ajouter(){
            System.out.println(getNumero());
            list1.add(this);
            
                        System.out.println(list1.size());
                        System.out.println(list1);
                        

        }
        public ArrayList<Avion> getListe1() {
        return list1;
    }
    
}
