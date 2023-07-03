package in.cdac.domain;

import java.util.List;
import java.util.*;

public class Nursery {
	private static List<Tree> trees;

	public Nursery() {
		trees = new ArrayList<>(); // upcasting
	}

	public void addTree(Tree tree) {
		if (tree != null) {

			System.out.println();
			trees.add(tree);

		}
	}

	public void removeTree(Tree tree) {

		trees.remove(tree);
	}

  static public void print() {

		for (Tree tree : trees) {

			System.out.println(tree);

		}

	}

	public Tree findTreeBySpecies(String species) {
		for (Tree tree : trees) {
			if (tree.getSpecies().equals(species)) {
				System.out.println(tree);
				return tree;
			}
		}
		return null;
	}

	public List<Tree> findTreesByAge(int age) {
		List<Tree> matchingTrees = new ArrayList<>();
		for (Tree tree : trees) {
			if (tree.getAge() == age) {
				matchingTrees.add(tree);
			}
		}
		return matchingTrees;
	}
}
