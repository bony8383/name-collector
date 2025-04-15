import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.askNames();
    }

    public void askNames() {
        Scanner sc = new Scanner(System.in);
        Set<String> nameSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); // сортирует и убирает дубликаты
        int count = 1;

        while (true) {
            System.out.print("Whats your name #" + count + ": ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                break; // завершить ввод, если пользователь вводит "exit"
            }

            if (nameSet.contains(name)) {
                System.out.println("This name was already entered!");
            } else {
                nameSet.add(name);
                System.out.println("Your name is #" + count + ": " + name);
                System.out.println("It has " + name.length() + " characters.");
                count++;
            }

            System.out.println("Enter 'exit' to stop entering names or add another name.");
            System.out.println();
        }

        // Показать всех введённых пользователей, отсортированных
        System.out.println("\nList of unique names (sorted):");
        int i = 1;
        for (String name : nameSet) {
            System.out.println("Name #" + i + ": " + name);
            i++;
        }

        System.out.println("Total unique names entered: " + nameSet.size());

        // Записать список в файл
        saveNamesToFile(nameSet);
    }

    public void saveNamesToFile(Set<String> nameSet) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("names.txt"))) {
            int i = 1;
            for (String name : nameSet) {
                writer.write("Name #" + i + ": " + name);
                writer.newLine();
                i++;
            }
            writer.write("Total unique names entered: " + nameSet.size());
            System.out.println("\nNames have been saved to names.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}