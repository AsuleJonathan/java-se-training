package com.systech.part2.inheritance.protectedaccessmodifier;

import com.systech.part2.inheritance.protectedaccessmodifier.nomenclature.kingdom.Kingdom;

public class ProtectedAccessModifier {
    
    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        // kingdom.sampleMethod();  ! Does not compile
    }
}