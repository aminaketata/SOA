package service;

import java.util.Date;

public class Compte
{
	double code,solde;
	Date dateCréation;
	 public Compte(double code,double solde,Date dateCréation)
	 {
		 code=this.code;
		 solde=this.solde;
		 dateCréation=this.dateCréation;
	 }
	public void setcode(double code)
	{
		code=this.code;
	}
	public void setsode(double solde)
	{
		solde=this.solde;
	}
	public void setdateCréation(Date dateCréation)
	{
		dateCréation=this.dateCréation;
	}
	public double getcode()
	{
		return code;
	}
	public double getsode()
	{
		return solde;
	}
	public Date getdateCréation()
	{
		return dateCréation;
	}
}
