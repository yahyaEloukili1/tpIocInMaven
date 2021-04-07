package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import Dao.DaoImpl;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

public class Pres2 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName = scanner.nextLine();
			Class cDao = Class.forName(daoClassName);
			IDao dao = (IDao) cDao.newInstance();
			
			String metierClassName = scanner.nextLine();
			Class cMetier = Class.forName(metierClassName);
		 	IMetier metier = (IMetier) cMetier.newInstance();
		     Method method = cMetier.getMethod("setDao", IDao.class);
			method.invoke(metier,dao);
			
			System.out.println(metier.calcul());
						
					
			
				
		}
	
		 catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException | SecurityException | NoSuchMethodException |IllegalArgumentException | InvocationTargetException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
