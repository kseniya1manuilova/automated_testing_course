import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        homework1Task1();
//        homework1Task2();
//        homework1Task3();
//        homework2Task1();

    }

    public static void myFirstProgram() {
        System.out.println("Hello world!");
    }

    public static void homework1Task1() {
        String firstName = "Kseniya";
        String lastName = "Manuilava";
        String jobTitle = "QA engeneer";

        System.out.println(firstName + " " + lastName + " works as a " + jobTitle + ".");
    }

    public static void homework1Task2() {
        byte age = 31;
        short yearOfBirth = 1994;
        int phoneNumber = 291111111;
        double BodyTemperature = 36.6;

        float height;
        height = 1.7F;

        boolean newMember;
        newMember = true;

        char gender;
        gender = 'F';

        String shortSummary = "My age is %d, I was born in %d and my phone number is %d.";

        String shortSummaryResult = String.format(shortSummary, age, yearOfBirth, phoneNumber);

        System.out.println(shortSummaryResult);
        System.out.println(BodyTemperature);
        System.out.println(height);
        System.out.println(newMember);
        System.out.println(gender);
    }

    public static void homework1Task3() {
        Scanner scannerData = new Scanner(System.in);

        String expectedCityName = "Minsk";
        System.out.println("Please, write your city");

        String userCity;
        userCity = scannerData.nextLine();

        System.out.println(userCity.equals(expectedCityName));

        System.out.println("Your have entered: " + userCity);

        int stringLenght = userCity.length();
        boolean cityNameFilledIn = userCity.isEmpty();
        char firstLetterOfTheCity = userCity.charAt(0);

        System.out.println("City lenght: " + stringLenght);

        String defaultCityName;
        defaultCityName = "Vitebsk";

        boolean cityNameAreEqual = userCity.equals(defaultCityName);

        boolean cityNameHaveEqualCaseInSensitive = userCity.equalsIgnoreCase(defaultCityName);

        boolean cityNameStartsWith = userCity.startsWith("V");

        boolean cityNameEndsWith = userCity.endsWith("k");

        boolean cityNameContains = userCity.contains("e");

        String updatedDefaultCity = defaultCityName.replace('b', 'B');

        String loweCaseDefaultCityName = defaultCityName.toLowerCase();

        System.out.println("The user left the input field emtpy: " + cityNameFilledIn);

        System.out.println("The first lerret of the City is " + firstLetterOfTheCity);

        System.out.println("Do the default city and the entered city match: " + cityNameAreEqual);

        System.out.println("The default city and the entered one have the same case in sensitive: "
                + cityNameHaveEqualCaseInSensitive);

        System.out.println("The City name contains 'd': " + cityNameContains);

        System.out.println("The City name starts 'V': " + cityNameStartsWith);

        System.out.println("The City name ends 'k': " + cityNameEndsWith);

        System.out.println(updatedDefaultCity);

        System.out.println(loweCaseDefaultCityName);

    }

    public static void homework2Task1() {
        Scanner scanner = new Scanner(System.in);
            int score;
            while(true){
                System.out.println("Please enter your score: ");
                score = scanner.nextInt();
                if (score <0 || score >101){
                    System.out.println("Incorrect value! Try again.");
                }
                else break;
            }
            if (score >= 90) {
                System.out.println("Your grade is A!");
            } else if (score >= 80) {
                System.out.println("Your grade is B!");
            } else if (score >= 70) {
                System.out.println("Your grade is C!");
            } else if (score >= 60) {
                System.out.println("Your grade is D!");
            } else if (score >= 50) {
                System.out.println("Your grade is E!");
            } else if (score <= 49) {
                System.out.println("Your grade is F!");
        }
    }
    }