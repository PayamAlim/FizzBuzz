import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, String> reaction =  new HashMap<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Please enter your numbers' reaction, then type \"0\":");
        int number;
        String voice;
        do {
            number = scn.nextInt();
            if (number == 0) break;
            voice = scn.next();
            reaction.put(number, voice);
            numbers.add(number);
        } while (number != 0);

        System.out.print("Okay, for the range \nfrom: ");
        int start = scn.nextInt();
        System.out.print("to: ");
        int end = scn.nextInt();
        System.out.println("We have:");
        for (int i = start; i <= end; i ++) {
            String output = "";
            for (int num: numbers) {
                if (i % num == 0)
                    output += reaction.get(num);
            }
            if (output == "") System.out.println(i);
            else System.out.println(output);
        }
    }
}