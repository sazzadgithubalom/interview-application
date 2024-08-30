package com.example.stram;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StramApi {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(60);
		marks.add(30);
		marks.add(50);
		marks.add(80);
		marks.add(90);
		marks.add(70);
		
		List<Integer> collect2 = marks.stream().filter(n -> n > 50 ).sorted().collect(Collectors.toList());
		
		List<Integer> collect = marks.stream().map(n -> n*2).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
