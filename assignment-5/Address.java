import java.io.*;
import java.util.*;

public class Address {
    private int id;
    private String city;
    private int pincode;
    private int studentId;

    public static final String ADDRESS_FILE = "addresses.txt";

    public Address(int id, String city, int pincode, int studentId) {
        this.id = id;
        this.city = city;
        this.pincode = pincode;
        this.studentId = studentId;
    }

    public String toCSV() {
        return id + "," + city + "," + pincode + "," + studentId;
    }

    
    public static List<Address> readAddresses() {
        List<Address> list = new ArrayList<>();
        File file = new File(ADDRESS_FILE);
        if (!file.exists()) return list;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                list.add(new Address(Integer.parseInt(p[0]), p[1], Integer.parseInt(p[2]), Integer.parseInt(p[3])));
            }
        } catch (IOException e) {
            System.out.println("Error reading address file.");
        }
        return list;
    }

    public static void saveAddresses(List<Address> addresses) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ADDRESS_FILE))) {
            for (Address a : addresses) {
                bw.write(a.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving address file.");
        }
    }
}
