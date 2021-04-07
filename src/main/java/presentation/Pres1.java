package presentation;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class Pres1 {

	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		DaoImpl dao = new DaoImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}

}
