package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation1 {
 public static void main(String[] args) {
	DaoImpl dao=new DaoImpl();//instanciation statique
	MetierImpl metier=new MetierImpl();
	metier.setDao(dao);
	System.out.println(metier.calcul());
}
}
