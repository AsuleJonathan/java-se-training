package com.systech.part2.polymorphism;

import com.systech.part2.inheritance.companysetup.DatabaseEngineer;
import com.systech.part2.inheritance.companysetup.Employee;
import com.systech.part2.inheritance.companysetup.QualityAssuarance;
import com.systech.part2.inheritance.companysetup.SoftwareEngineer;
import com.systech.part2.inheritance.protectedaccessmodifier.nomenclature.genus.Genus;
import com.systech.part2.inheritance.protectedaccessmodifier.nomenclature.kingdom.Kingdom;
import com.systech.part2.inheritance.protectedaccessmodifier.nomenclature.species.Species;

public class PolymorphismDemo {
    public static void main(String[] args) {

        Employee james = new QualityAssuarance("001", "James",
                "047", "Quality Assurance Chief Engineer");

        Employee ivy = new SoftwareEngineer("002", "Ivy",
                "035", "Senior Software Engineer");

        Employee lenna = new DatabaseEngineer("003", "Lenna",
                "035", "Senior Database Engineer");

        System.out.println(james);
        System.out.println(ivy);
        System.out.println(lenna);


        Kingdom species = new Species();
        Kingdom genus = new Genus();


    }
}