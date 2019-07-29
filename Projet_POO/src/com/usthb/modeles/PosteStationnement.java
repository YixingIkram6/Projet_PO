package com.usthb.modeles;
 
 
public class PosteStationnement {
    String numero;
	char caractere;
	static int cpt=1;
	private int sequentiel;
	boolean contact;
	int x;
	int y;
	
	PosteStationnement(char caractere,boolean contact,int x, int y){
		sequentiel=cpt;
		this.numero=caractere+""+sequentiel;
		this.contact=contact;
		this.x=x;
		this.y=y;
		cpt++;
	}

	public String getNumero() {
		return numero;
	}


	public boolean isContact() {
		return contact;
	}

	 

	public int getX() {
		return x;
	}
	 

   public int getY() {
		return y;
	}
     
}
