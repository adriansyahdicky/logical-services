package com.logical.logicalservice.controller;

import com.logical.logicalservice.dto.BalancedBracketsDTO;
import com.logical.logicalservice.dto.PalindromeDTO;
import com.logical.logicalservice.dto.WeightedDTO;
import com.logical.logicalservice.service.BalancedBracketServices;
import com.logical.logicalservice.service.PalindromeServices;
import com.logical.logicalservice.service.WeightedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/logics")
public class LogicController {

    @Autowired
    private WeightedServices weightedServices;

    @Autowired
    private PalindromeServices palindromeServices;

    @Autowired
    private BalancedBracketServices balancedBracketServices;

    @PostMapping(value = "/weighted")
    public ResponseEntity<List<String>> weightedStrings(@RequestBody WeightedDTO weightedDTO){
        return ResponseEntity.ok(weightedServices.generateSubstrings(weightedDTO));
    }

    @PostMapping(value = "/palindrome")
    public ResponseEntity<String> palindromes(@RequestBody PalindromeDTO palindromeDTO){
        return ResponseEntity.ok("---Result---"+ palindromeServices.
                findHighestPalindrome(palindromeDTO.getInput(), palindromeDTO.getK()));
    }

    @PostMapping(value = "/balanced-brackets")
    public ResponseEntity<String> balancedBrackets(@RequestBody BalancedBracketsDTO balancedBracketsDTO){
        return ResponseEntity.ok("---Result--- "+  balancedBracketServices.
                isBracketBalanced(balancedBracketsDTO));
    }

}
