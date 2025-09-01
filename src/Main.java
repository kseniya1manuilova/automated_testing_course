import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      String firstName = "Kseniya";
      String lastName = "Manuilava";
      String jobTitle = "QA engeneer";

      System.out.println(firstName +" " + lastName + " works as a " + jobTitle + ".");

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

        String userFirstNameAndYob = String.format("Имя пользователя %s, год рождения %d.", firstName, yearOfBirth);

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

        System.out.println(userFirstNameAndYob);
        }
    }