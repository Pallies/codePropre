package ex3;

import ex3.enums.Categorie;
import ex3.enums.Regime;
import ex3.models.Animal;
import ex3.models.Zoo;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle", Categorie.MAMMIFERE, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Categorie.MAMMIFERE, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Categorie.MAMMIFERE, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", Categorie.MAMMIFERE, Regime.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Categorie.POISSON, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", Categorie.POISSON, Regime.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", Categorie.REPTILE, Regime.CARNIVORE));
		zoo.addAnimal(new Animal("Python", Categorie.REPTILE, Regime.CARNIVORE));
	}

}
