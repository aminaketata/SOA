package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService 
{
	double montant;
	public double Conversion(double montant)
	{
		montant=montant*3.6;
		return montant;
	}
	public Compte getCompte(int code) {
		return new Compte(code,0,new Date());
		}
	public List<Compte> getComptes(){
		List<Compte> Comptes =new ArrayList<Compte>(); 
		return Comptes;
	}
}
