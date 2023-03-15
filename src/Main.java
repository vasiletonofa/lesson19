
import employee.Employee;
import employee.Salariu;

import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        List<String> list = new ArrayList<>();
        list.add("Ion");
        list.add("Ion");

        // 1. Ordonat
        // 2. Nu este sortat
        // 3. Nu sunt unice

        "aa".equals("bb");


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("5+");  // hashCode = 123
        hashSet.add("5*");  // hashCode = 123
        hashSet.add("5");   // hashCode = 123

        // 1. Elemente unice


        // Object.hashCode() -> grupeaza dupa adresele de memorie


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Key1", "Ion");
        hashMap.put("Key2", "Ion");


        // 1. Foloseste Key Valoare
        // 1. Valoare la hashMap nu participa la nici o comparare sau calculare
        // 1. Daca gasim cheia in grup, schimbam valoarea
        // 1. Daca nu gasim cheia in grup, adaugam cheia si valoarea

        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("Ion", 24));
        employees.add(new Employee("Vasile", 24));
//        employees.add(new Employee("Vasile", 24));


        HashMap<Employee, String> employeesMap = new HashMap<>();

        employeesMap.put(new Employee("Ion", 24), "Valoare1"); // 24
        employeesMap.put(new Employee("Vasile", 25), "Valoare2"); // 25
        employeesMap.put(new Employee("Gheorghe", 25), "Valoare3"); // 25
        employeesMap.put(new Employee("Gheorghe", 25), "Valoare5"); // 25
//        employees.add(new Employee("Vasile", 24));


        employeesMap.size(); //

        employeesMap.put(new Employee("Ion", 24), "Valoare1"); // 24
        employeesMap.put(new Employee("Vasile", 25), "Valoare2"); // 25
        employeesMap.put(new Employee("Gheorghe", 25), "Valoare5"); // 25

        // 1. Generem hashCode dupa cheie
        // 2.


        Employee ion = new Employee("Ion", 24);
        Employee vasile = new Employee("Vasile", 24);
        Employee gheorghe = new Employee("Gheorghe", 24);


        HashMap<Employee, Integer> salariesMap = new HashMap<>();

        salariesMap.put(ion, 300000);
        salariesMap.put(vasile, 400000);
        salariesMap.put(gheorghe, 500000);

        salariesMap.put(vasile, 500000);

        HashMap<Employee, Integer> zileLucrateMaps = new HashMap<>();

        zileLucrateMaps.put(ion, 500);
        zileLucrateMaps.put(vasile, 600);
        zileLucrateMaps.put(gheorghe, 700);

        zileLucrateMaps.put(ion, 501);
        zileLucrateMaps.put(vasile, 601);
        zileLucrateMaps.put(gheorghe, 701);

        System.out.println("Informatii despre Ion:  zile lucrate = " + zileLucrateMaps.get(ion)  + " salariu = " + salariesMap.get(ion));


        HashMap<Employee, Integer> datorii = new HashMap<>();
        datorii.put(ion, 20000);

        HashMap<Employee, String> zodiile = new HashMap<>();
        zodiile.put(ion, "Fecioara");

        HashSet<Employee> programatori = new HashSet<>();
        programatori.add(vasile);
        programatori.add(gheorghe);


        for(Employee employee : programatori) {
            System.out.println(employee); // vasile, gheorghe
        }

        HashSet<Employee> contabili = new HashSet<>();
        contabili.add(ion);

        afiseazaProgramatorii(programatori);

        afiseazaContabilii(contabili);

        ion.addSalary(new Salariu(Month.FEBRUARY, 200000L));
//        ion.addSalary(new Salariu(Month.FEBRUARY, 200000L));
        ion.addSalary(new Salariu(Month.FEBRUARY, 1000L));



    }


    static void calculeazaSalarii(HashMap<Employee, Integer> map) {
        // PARCURGERE MAP SI SUMARE SALARIU
    }

    static void afiseazaProgramatorii(HashSet<Employee> set) {
        // PARCURGERE MAP SI SUMARE SALARIU
    }

    static void afiseazaContabilii(HashSet<Employee> set) {
        // PARCURGERE MAP SI SUMARE SALARIU
    }

}