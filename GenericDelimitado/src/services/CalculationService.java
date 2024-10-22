package services;

import java.util.List;

public class CalculationService {

	// Cria um método passando T como parâmetro para comparação dos objetos da lista.
	// Veja a classe entities.Product para ver o Override do método CompareTo().
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
