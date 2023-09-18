package com.systech.part2.inheritance;

import java.util.logging.Logger;

import com.systech.part2.inheritance.companysetup.QualityAssuarance;
import com.systech.part2.inheritance.companysetup.SoftwareEngineer;

public class InheritanceDemo {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();
        /*
         * LOGGER.info("app => " + app.hashCode());
         * LOGGER.info("app => " + app.toString());
         * LOGGER.info("app => " + app.getClass().getPackageName());
         */

        app.companysetup();

    }

    /*
     * public void companysetup() {
     * SoftwareEngineer e1 = new SoftwareEngineer();
     * e1.setEmployeeName("Emily");
     * e1.setEmployeeNo("001");
     * e1.setEmployeeAddress("Nakawa - Kampala");
     * e1.setTitle("Software Engineer");
     * LOGGER.info("SoftwareEngineer => " + e1.toString());
     * 
     * QualityAssurance qa = new QualityAssurance();
     * qa.setEmployeeName("Halkano");
     * qa.setEmployeeNo("002");
     * qa.setEmployeeAddress("Isiolo - Kenya");
     * qa.setTitle("Quality Assurance");
     * LOGGER.info("Quality Assurance => " + qa.toString());
     * }
     */

    public void companysetup() {
        SoftwareEngineer e1 = new SoftwareEngineer("001", "Emily", "Nakawa-Kampala", "SoftwareEngineer");

        LOGGER.info("SoftwareEngineer => " + e1.toString());

        QualityAssuarance qa = new QualityAssuarance("002", "Halkano", "Isiolo - Kenya", "Quality Assurance");

        LOGGER.info("Quality Assurance => " + qa.toString());
    }
}
