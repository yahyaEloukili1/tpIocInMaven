package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Metier.IMetier;

public class PresAvecSpringAnnotation {

	public static void main(String[] args) {
		//au demarage tu vas scanner les classes
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"Dao","Metier");
		IMetier metier = context.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}

}
