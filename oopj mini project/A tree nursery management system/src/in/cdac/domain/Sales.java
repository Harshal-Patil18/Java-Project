package in.cdac.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Sales {
	private List<Tree> soldTrees;
	private double totalRevenue;

	public Sales() {
		soldTrees = new ArrayList<>();
		totalRevenue = 0.0;
	}

	public void addSale(Tree tree) {
		try {
			soldTrees.add(tree);
			totalRevenue += tree.getPrice();
			System.out.println(totalRevenue);
		} catch (NullPointerException e) {
			
			e.printStackTrace();
		}
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}

	public Map<String, Integer> getSalesBySpecies() {
		Map<String, Integer> salesBySpecies = new HashMap<>();
		for (Tree tree : soldTrees) {
			String species = tree.getSpecies();
			if (salesBySpecies.containsKey(species)) {
				int count = salesBySpecies.get(species);
				salesBySpecies.put(species, count + 1);
			} else {
				salesBySpecies.put(species, 1);
			}
		}
		return salesBySpecies;
	}
}
