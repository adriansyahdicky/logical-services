package com.logical.logicalservice.service;

import com.logical.logicalservice.dto.WeightedDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeightedServices {

    public List<String> generateSubstrings(WeightedDTO weightedDTO) {
        List<String> substrings = new ArrayList<>();
        int n = weightedDTO.getInput().length();
        List<String> checkExistsAlphabet = new ArrayList<>();
        List<Integer> dataResult = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder substring = new StringBuilder();
            char currentChar = weightedDTO.getInput().charAt(i);
            int j = i;

            int size = checkExistsAlphabet.stream().filter(s ->
                            s.contains(String.valueOf(currentChar)))
                    .toList().size();

            int totalWeight = 0;

            while (j < n && weightedDTO.getInput().charAt(j) == currentChar && size == 0) {
                substring.append(currentChar);
                substrings.add(substring.toString());
                checkExistsAlphabet.add(String.valueOf(currentChar));
                int charWeight = currentChar - 'a' + 1;
                totalWeight += charWeight;
                dataResult.add(totalWeight);
                j++;
            }
        }

        List<String> finalResult = new ArrayList<>();
        for (Integer query : weightedDTO.getQueries()) {
            finalResult.add(dataResult.contains(query) ? "Yes" : "No");
        }
        return finalResult;
    }



}
