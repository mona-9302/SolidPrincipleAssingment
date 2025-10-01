import java.io.*;
import java.util.*;

 class Class {
    private int id;
    private String name;

    public static final String CLASS_FILE = "classes.txt";

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public String toCSV() {
        return id + "," + name;
    }

   
    public String toString() {
        return "Class: " + id + " - " + name;
    }

  
    public static List<ClassData> readClasses() {
        List<ClassData> list = new ArrayList<>();
        File file = new File(CLASS_FILE);
        if (!file.exists()) return list;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                list.add(new ClassData(Integer.parseInt(p[0]), p[1]));
            }
        } catch (IOException e) {
            System.out.println("Error reading class file.");
        }
        return list;
    }

    public static void saveClasses(List<Class> classes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CLASS_FILE))) {
            for (Class c : classes) {
                bw.write(c.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving class file.");
        }
    }
}
