import phonebook.PhoneDirectory;
import phonebook.Record;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add(new Record("Vitya", "124423141"));
        phoneDirectory.add(new Record("Vitya", "6616164846"));
        phoneDirectory.add(new Record("Lesya", "7898465489"));
        phoneDirectory.add(new Record("Vitya", "65464843216586"));
        phoneDirectory.add(new Record("Gomik", "1614984949"));

        System.out.println(phoneDirectory.find("Vitya"));
        System.out.println(phoneDirectory.find("Lesya"));
        System.out.println(phoneDirectory.findAll("Vitya"));
    }
}