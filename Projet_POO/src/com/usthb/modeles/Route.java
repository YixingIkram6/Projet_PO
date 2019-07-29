 
package com.usthb.modeles;
 
public class Route {
 String numero="R";
	static int cpt=1;
	private int sequentiel;
	boolean intersection=false;
	boolean[][] occupation=new boolean[24][60];
	private String[][] MatMoyens = new String[24][60];
	public Route(){
		sequentiel=cpt;
		this.numero=numero+sequentiel;
		for (int i=0;i<24;i++){
			for(int j=0;j<60;j++){
				this.occupation[i][j] = false;
			}
		}
		cpt++;
	 
	}
	 public boolean verifieRoute(int h, int m) {
	    	return occupation[h][m];
	    }
	   public void occuper(int h, int m, String moyen) {
	    	this.occupation[h][m]=true;
	    	this.MatMoyens[h][m]=moyen;
	    }

	public String getNumero() {
		return numero;
	}


	public boolean isIntersection() {
		return intersection;
	}


	public boolean[][] getOccupation() {
		return occupation;
	}

	 
	
	
        
}
