package com.example.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // Skip spaces
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Convert the frequency map to a list of Map.Entry
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Sort the list by frequency in descending order
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Print the sorted entries
        System.out.println("Character Frequency (Sorted):");
        for (Map.Entry<Character, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        
        String para = "Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added.";
		List<Character> charList =  para.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		Map<Character, Long> freeMap = charList.stream().collect(Collectors.groupingBy(c-> c, Collectors.counting()));
		
    }
    
}
