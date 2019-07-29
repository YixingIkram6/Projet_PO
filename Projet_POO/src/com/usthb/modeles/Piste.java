 
package com.usthb.modeles;

 
public class Piste {
      String numero="p";
	static int cpt=1;
	private int sequentiel;
	 
	String orientation; 
	int longeur;
	float pente;
	boolean[][] occupation=new boolean[24][60];  ;  //24x60
	private String[][] MatAvions=new String[24][60];
	
	public Piste(String orientation,int longeur,float pente){
		sequentiel=cpt;
		this.numero=numero+""+sequentiel;
		this.orientation=orientation;
		this.longeur=longeur;
		this.pente=pente;
		for (int i=0;i<24;i++){
			for(int j=0;j<60;j++){
				this.occupation[i][j] = false;
			}
		}
		cpt++;
		
		
	}
	 public boolean verifiePiste(int h, int m) {
	    	return occupation[h][m];
	    }
	    
	    public void occuper(int h, int m, String avion) {
	    	this.occupation[h][m]=true;
	    	this.MatAvions[h][m]=avion;
	    }
	
	public String getNumero() {
		return numero;
	}

	 
	public String getOrientation() {
		return orientation;
	}

	 

	public int getLongeur() {
		return longeur;
	}
 
	public float getPente() {
		return pente;
	}
 
	public boolean[][] getOccupation() {
		return occupation;
	}
    
}
