package com.spring.intro.Spring5Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int BinarySearch(int[] list, int searchItem) {
		
		/* Sort List*/
		int[] sortedList = sortAlgorithm.sort(list);
		/* Search List */
		/* Return Position */
		System.out.println(sortAlgorithm);
		return 3;
	}
}
