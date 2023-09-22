import java.util.Random;

public class StudentSelect {
   public static void main(String[] args) {
        Random rand = new Random();
        
        String[] students = {"Bodhi",
            "Robert",
            "Rebecca",
            "Daniel",
            "Sabin",
            "Sunny",
            "Dylan",
            "Devin",
            "Kate",
            "Ana",
            "Cayden",
            "Flor",
            "Jami",
            "Akhmed",
            "Giacomo",
            "Kai",
            "Evan",
            "Leonard",
            "Casey",
            "Marques",
            "Sara",
            "Ryan"
            };

        int ix = rand.nextInt(students.length);
        System.out.println(students[ix]);
   } 
}
