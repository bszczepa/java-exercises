package pl.edu.agh.java.exercises.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span found in
 * the given array. (Efficiency is not a priority.)
 * 
 * Przyjmijmy, że odstęp "span" danej wartości w tablicy to liczba elementów
 * pomiędzy pierwszym i ostatniem jej wystąpieniem, włączając je same. Jeśli
 * wartość pojawia się w tablicy tylko raz, jej "span" jest równe 1. Metoda
 * maxSpan powinna zwracać największy istniejący odstęp w zadanej tablicy.
 * 
 * @see http://codingbat.com/prob/p189576
 */
public class ArraySpan {
	
	private Map<Integer, ArrayList<Integer>> valuesMap = new HashMap<Integer, ArrayList<Integer>>();
	
	public int maxSpan(int[] array) {
	
		throw new UnsupportedOperationException();
	}
	
	public void createMap(int[] array) {
		
		for (int i = 0; i< array.length; i++) {
			if (!valuesMap.containsKey(array[i])) {
				valuesMap.put(array[i], new ArrayList<Integer>(i)); 
			} else {
				ArrayList<Integer> temp = valuesMap.get(array[i]);
				temp.add(i);
				valuesMap.put(array[i], temp);
			}
		}
	}
}
