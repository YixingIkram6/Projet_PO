package com.usthb.controlleurs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.usthb.modeles.MoyTransport;
import com.usthb.controlleurs.Orientation;
import com.usthb.controlleurs.TypeAvion;
import com.usthb.controlleurs.TypeMoyens;
import com.usthb.modeles.Avion;
import com.usthb.modeles.Piste;
import com.usthb.modeles.Route;

enum TypeAvion{
	AIRBUS,  BOEING,  ATR
}
enum TypeMoyens{
	VOI,  CAM,  BUS,  AVI
}

enum Orientation {
	NORD, SUD, EST, OUEST
}


public class main {

	public static void main(String[] args) {
		        HashMap<Integer, MoyTransport> moyens = new HashMap<Integer, MoyTransport>();
		        ArrayList<Avion> avions = new ArrayList<Avion>();
				ArrayList<Route> routes = new ArrayList<Route>();
				ArrayList<Piste> pistes = new ArrayList<Piste>();
				Scanner scan = new Scanner(System.in); ;
				char choix = 'z';
				
				while (choix != '*') {
					
					System.out.println("A -Saise des moyens de transport \n");
					System.out.println("B -Saise des avions \n");
					System.out.println("C -Ajouter un moyen de transport \n");
					System.out.println("D -Ajouter un avion \n");
					System.out.println("E -Saisie des routes\n");
					System.out.println("F -Saisie des pistes\n");
					System.out.println("G -Afficher la liste des moyens \n");
					System.out.println("H -Afficher la liste des avions \n");
					System.out.println("I -Chercher une route libre à un horaire donné et autoriser un moyen\n");
					System.out.println("J -Chercher une piste libre à un horaire donné et autoriser un avion\n");


					
					choix = scan.next().charAt(0);
					switch(choix) {
						case ('a'|'A') : saisieMoyens(moyens);
						break;
						
						case ('b'|'B'): saisieAvions(avions);
						break;
						
						case ('c'|'C'): ADDMoyen(moyens); 
						break;
						
						case ('d'|'D'): ADDAvion(avions); 
						break;
						
						case ('e'|'E'): saisieRoutes(routes);
						break;
						
						case ('f'|'F'): saisiePistes(pistes);
						break;
						
						case ('g'|'G'): afficherListeMoyens(moyens);
						break;
						
						case ('h'|'H'): afficherListeAvions(avions);
						break;
						
						case ('i'| 'I'): chercherRoute(routes, moyens);
						break;
						
						case ('j' | 'J'): chercherPiste(pistes, avions);
						break;	
						
						
					}
					
					
				}
				
				
			scan.close();	
				
			}	
	private static void ADDAvion(ArrayList<Avion> avions){	
		Scanner ss = new Scanner(System.in);
		long NumSerie;
		int charge_carburant, nbr_voyageurs;
		String modele, compagnie;
		int t;
		
		System.out.println("Saisir le numero \n");
		NumSerie = ss.nextLong();
		System.out.println("Saisir le modele\n");
		modele = ss.next();
		System.out.println("Saisir le type de l'avion\n");
		System.out.println("1 -AIRBUS   2 -BOEING   3 -ATR" );
		do {t = ss.nextInt();} while(t<1 || t>3);
		
		System.out.println("Saisir la compagnie \n");
		compagnie = ss.next();
		System.out.println("Saisir la charge \n");
		do{charge_carburant = ss.nextInt();}while(charge_carburant<0 || charge_carburant>1000);
		System.out.println("Saisir le nbr de voyageurs \n");
		do{nbr_voyageurs = ss.nextInt();}while(nbr_voyageurs<0 || nbr_voyageurs>charge_carburant);
		
		avions.add(new Avion(NumSerie, modele, TypeAvion.values()[t-1].toString(), compagnie, charge_carburant, nbr_voyageurs));
	}
	private static void saisieAvions(ArrayList<Avion> avions) {
		Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Entrer le nbr des avions: ");
			do{n = sc.nextInt();} while(n<1 || n>50);
			for(int i=0; i<n; i++) ADDAvion(avions);
			
		}
	private static void ADDMoyen(HashMap<Integer, MoyTransport> moyens){
		Scanner s = new Scanner(System.in);
		
		long serie;
		String matricule, modele, entreprise;
		int t;
		System.out.println("Saisir le type du moyen \n");
		System.out.println("1 -Voiture   2 -AutoBus");
		do{ t = s.nextInt();} while(t<1 || t>4);
		System.out.println("Saisir le numero de serie \n");
		serie = s.nextLong();
		System.out.println("Saisir la matricule \n");
		matricule = s.next();
		System.out.println("Saisir le modele \n");
		modele = s.next();
		System.out.println("Saisir le nom de l\'entreprise propriétaire \n");
		entreprise = s.next();
		
		moyens.put(moyens.size(), new MoyTransport(TypeMoyens.values()[t-1].toString(), serie, matricule, modele, entreprise));

	}
	private static void saisieMoyens(HashMap<Integer, MoyTransport> moyens) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le nombres des moyens: ");
		int n ;
		do{n= sc.nextInt();} while(n<1 || n>50);
		for(int i=0; i<n; i++) ADDMoyen(moyens);
		
	}
	private static void saisieRoutes(ArrayList<Route> routes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez donner le nombre des routes: ");
		int n;
		do{n= sc.nextInt();} while(n<0 || n>50);
		for(int i=0; i<n; i++) routes.add(new Route());
	}
	private static void saisiePistes(ArrayList<Piste> pistes) {
		Scanner s = new Scanner(System.in);
		int orient;
		int longeur;
		float pente;
		System.out.println("Saisie le nbr des pistes :");
		int n;
		do{n = s.nextInt();} while(n<0 || n>50);	
		for(int i=0; i<n; i++) {
			System.out.println("Saisie l'orientation de la piste :");
			System.out.println("1 -NORD   2 -SUD   3 -EST   4 -OUEST");
			do{orient = s.nextInt();} while(orient<1|| orient>4);
			
			System.out.println("Saisie la longueur de la piste :");
			do{longeur = s.nextInt();} while(longeur<1);
			
			System.out.println("Saisie la pente de la piste :");
			do{pente = s.nextFloat();} while(pente<0);
			pistes.add(new Piste(Orientation.values()[orient-1].toString(), longeur, pente));
		}
	}
		private static void afficherListeMoyens(HashMap<Integer, MoyTransport> moyens) {
			for(Map.Entry<Integer, MoyTransport> m:moyens.entrySet()) {
				System.out.println("\n    moyen  "+m.getKey()+" : "+m.getValue());
				System.out.println("******************************");
			}
		}
		private static void afficherListeAvions(ArrayList<Avion> avions) {
			for(int i=0; i<avions.size(); i++) {
				System.out.println("\n    Avion "+ i +": " + avions.get(i));
				System.out.println("******************************");
			}
		}
	
		//chercher route et autoriser un moyen
		private static void chercherRoute(ArrayList<Route> routes, HashMap<Integer, MoyTransport> moyens) {
			Scanner sc = new Scanner(System.in);
			int h, m, i, s;
			boolean libre = false;
			System.out.println("\nEntrer l'horaire (Heure,Min)");
			System.out.println("Heure: ");
			do{h = sc.nextInt();} while(h<0 || h>23);
			System.out.println("Min: ");
			do{m = sc.nextInt();} while(m<0 || m>23);
			for(i=0; i<routes.size(); i++) {
				if(!routes.get(i).verifieRoute(h, m)) {
					libre = true;
					break;
				}
			}
			if(libre) {
				System.out.println("Le route "+routes.get(i).getNumero()+" est libre.");
				
				do {
					System.out.println("Voulez-vous autoriser un mmoyen ? \n");
					System.out.println("1 -OUI    2 -NON");
					s = sc.nextInt();
				}while(s<1 || s>2);
				if(s==1) {
					afficherListeMoyens(moyens);
					do{
						System.out.println("Entrer le numero de la moyen pour autoriser ");
						s = sc.nextInt();
					}while(s<0 || s>=moyens.size());
					routes.get(i).occuper(h, m, moyens.get(s).getNumero());
				}
			}
			else System.out.println("\nTous les routes sont occupées a cette horaire ..");
		}
		private static void chercherPiste(ArrayList<Piste> pistes, ArrayList<Avion> avions) {
			Scanner sc = new Scanner(System.in);
			int h, m, i, s;
			boolean libre = false;
			System.out.println("\nEntrer l'horaire (Heure,Min)");
			System.out.println("Heure: ");
			do{h = sc.nextInt();} while(h<0 || h>23);
			System.out.println("Min: ");
			do{m = sc.nextInt();} while(m<0 || m>23);
			for(i=0; i<pistes.size(); i++) {
				if(!pistes.get(i).verifiePiste(h, m)) {
					libre = true;
					break;
				}
			}
			if(libre) {
				System.out.println("Le piste "+pistes.get(i).getNumero()+" est libre.");
				
				do {
					System.out.println("Voulez-vous autoriser un avion ? \n");
					System.out.println("1 -OUI    2 -NON");
					s = sc.nextInt();
				}while(s<1 || s>2);
				if(s==1) {
					afficherListeAvions(avions);
					do{
						System.out.println("Entrer le numero de l'avion pour autoriser ");
						s = sc.nextInt();
					}while(s<0 || s>=avions.size());
					pistes.get(i).occuper(h, m, avions.get(s).getNumero());
				}
			}
			else System.out.println("\nTous les pistes sont occupées a cette horaire ..");
		}
			
	

}

