package com.systech.part2.inheritance.protectedaccessmodifier.nomenclature.species;

import com.systech.part2.inheritance.protectedaccessmodifier.nomenclature.genus.Genus;

public class Species extends Genus {
    
    public void printInfo(){
        System.out.println(randomString);
    }
    public void callSampleMethod(){
        System.out.println(sampleMethod());
    }
}
