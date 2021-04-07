package Metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Dao.IDao;

@Service("metier")
public class MetierImpl implements IMetier{

	@Autowired
	private IDao dao;
	
	public MetierImpl() {
	System.out.println("Instantiation de metierImpl");
	}

	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection de depandances");
	}

	@Override
	public double calcul() {
		double data = dao.getData();
		return data * 2;
	}
	public void init() {
		System.out.println("Inititalisation de MetierImpl");
	}
}
