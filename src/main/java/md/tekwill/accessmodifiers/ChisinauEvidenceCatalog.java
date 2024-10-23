package md.tekwill.accessmodifiers;

import md.tekwill.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person person0001 = new Person("Victor", "Popescu", 1234);
        System.out.println(person0001.ID);
        System.out.println(person0001.getAge());

        Person person0002 = new Person("Sanda", "Ionescu", 1235, 18, false);
        System.out.println(person0002.getAge());

        Person person0003 = new Person("Octavian", "Antoniuc", 1237, 102, true);
        System.out.println(person0003.getAge());

        if (person0001.isRetired) {
            System.out.println(person0001.firstName + " este pensionat");
        } else {
            System.out.println(person0001.firstName + " nu este pensionat");
        }

        if (person0002.isRetired) {
            System.out.println(person0002.firstName + " este pensionata");
        } else {
            System.out.println(person0002.firstName + " nu este pensionata");
        }

        person0003.printRetirementStatus();

        Person person0004 = new Person("Sofia", "Rsmura", 2451, 30, false);
        Person person0005 = new Person("Victoria", "Green", 5474, 85, true);

        person0004.printRetirementStatus();
        person0005.printRetirementStatus();

        Person.isHuman = true;


    }
}
