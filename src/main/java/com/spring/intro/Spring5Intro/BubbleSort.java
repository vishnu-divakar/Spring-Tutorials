package com.spring.intro.Spring5Intro;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {
	
	public int[] sort(int[] unsortedList) {
		return unsortedList;
	}
}
