package com.spring.intro.Spring5Intro;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] unsortedList) {
		// TODO Auto-generated method stub
		return unsortedList;
	}

}
