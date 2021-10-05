package com.company;

public class Main {

    static String name="Nipuni";
    public static final int serialNum= 10;
    boolean isActive = false;

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Name "+name);
        String myName = "Nipuni" + "  "+"Mahesha";
        //Specific reasons
        int valA = 10;
        double valB = (double) valA;

        int valC = valA/(int) 2.5;
        System.out.println("valC = "+valC);

        // Driving Licen Apply
        int age = 88;

        if (age < 18){
            System.out.println("Not eligible for a driving license");
        }
        else if (age>80){
            System.out.println("Too old to drive. Please submit a health check result");
        }
        else {
            System.out.println("Allowed to apply");
        }

        //Example-If
        /* double apiVersion = Double.parseDouble(args[1]);
        final double DEPRECATED_VERSION =3.11;
        final double LATEST_VERSION = 7.6;

        if (apiVersion <= DEPRECATED_VERSION){
            System.out.println("Deprecated API Version:" + apiVersion);
        }
        else if (apiVersion == LATEST_VERSION){
            System.out.println("Latest API Version:" + apiVersion);
        }
        else {
            System.out.println("Accepted API Version:" + apiVersion);
        }
        */
        // Above Code has some error i can't find it

        // Example-switch

        /*
        char osName;
        switch (osName){
            case "iOS":
                System.out.println("Vendor(s):");
                System.out.println("Apple");
                break;
            case "Android":
                System.out.println("Vendor(s):");
                System.out.println("Google");
                System.out.println("Samsung");
                System.out.println("Huawei");
                System.out.println("OnePlus");
                System.out.println("Nokia");
                break;
            case "WindowsPhone":
                System.out.println("Vendor(s):");
                System.out.println("Nokia");
                break;
            default:
                System.out.println("Unknown os");
        }

         *///this also have mistake
    }
}
