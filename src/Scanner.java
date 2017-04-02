

public class Scanner {
    private java.util.Scanner scanner;

    public Person readeAndCreatePerson() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("podaj imię: ");
        String firstName = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("podaj wiek");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("podaj pesel");
        int pesel = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return new Person(firstName, lastName, age, pesel);

    }
}


