import java.util.Scanner;

public class PersonalityTest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize variables
        int leader = 0;
        int thinker = 0;
        int social = 0;
        int creative = 0;

        // list of questions
        String[] questions = {
                "When starting a group project, what do you do first?",
                "Your friend group is making weekend plans. You usually...",
                "Which environment sounds most energizing?",
                "If a plan suddenly changes, you tend to...",
                "When learning something new, you prefer to...",
                "In a group disagreement, you usually...",
                "Your ideal free hour looks like...",
                "When you’re under pressure, you’re most likely to...",
                "People often describe you as...",
                "If you could pick a role on a team, you’d be the..."
        };

        // list of lists of choices
        String[][] choices = {
                {"A) Take charge and assign tasks",
                        "B) Research what works best before acting",
                        "C) Ask everyone what they think and build the consensus",
                        "D) Brainstorm big, original ideas first"},

                {"A) Make the decision quickly and move forward",
                        "B) Compare options and think through details",
                        "C) Make sure everyone feels included",
                        "D) Suggest something unique or unexpected"},

                {"A) A fast-paced challenge with clear goals",
                        "B) A quiet space to think and analyze",
                        "C) A lively hangout with lots of conversation",
                        "D) A creative studio with room to experiment"},

                {"A) Adjust immediately and keep things moving",
                        "B) Re-evaluate and pick the best new option",
                        "C) Check in with everyone and keep morale up",
                        "D) Turn it into an opportunity to try something new"},

                {"A) Jump in and learn by doing",
                        "B) Read, watch, and understand the logic first",
                        "C) Learn with others and talk it through",
                        "D) Explore and improvise until it clicks"},

                {"A) Lead the discussion toward a solution",
                        "B) Ask questions and clarify the facts",
                        "C) Mediate and make sure everyone is heard",
                        "D) Offer a fresh angle that reframes the problem"},

                {"A) Knocking out goals and checking things off",
                        "B) Solving a puzzle or diving into a topic",
                        "C) Catching up with someone you care about",
                        "D) Creating something like music, art or writing"},

                {"A) Take action and push through",
                        "B) Stay calm and think it though step-by-step",
                        "C) Reach out and lean on your people",
                        "D) Find an unconventional solution"},

                {"A) Confident and decisive",
                        "B) Thoughtful and logical",
                        "C) Friendly and supportive",
                        "D) Imaginative and original"},

                {"A) Captain who focuses on direction and execution",
                        "B) Strategist who focuses on planning and analysis",
                        "C) Connector who focuses team chemistry and support",
                        "D) Innovator who focuses on new ideas and creativity"}
        };

        // introduction to the user
        System.out.println("---------------------------------");
        System.out.println("WELCOME TO THE PERSONALITY TEST");
        System.out.println("---------------------------------");
        System.out.println("Please enter A, B, C, or D for each of the questions");

        // for each question
        for (int q = 0; q < questions.length; q++) {

            // print the question
            System.out.println("\nQuestion " + (q + 1));
            System.out.println(questions[q]);

            // print the choices
            for (int c = 0; c < choices[q].length; c++) {
                System.out.println(choices[q][c]);
            }

            // get an answer from the user
            System.out.print("Your answer: ");
            String answer = getValidAnswer(input);

            // score after answer
            switch (answer) {
                case "A" -> leader++;
                case "B" -> thinker++;
                case "C" -> social++;
                case "D" -> creative++;
            }

            System.out.println("----------------------------");
        }

        // personality logic
        String result = "The Leader";
        int highest = leader;

        if (thinker > highest) {
            highest = thinker;
            result = "The Thinker";
        }
        if (social > highest) {
            highest = social;
            result = "The Social Butterfly";
        }
        if (creative > highest) {
            highest = creative;
            result = "The Creative";
        }

        // display Results
        System.out.println("\n========= RESULTS =========");
        System.out.println("Leader: " + leader);
        System.out.println("Thinker: " + thinker);
        System.out.println("Social Butterfly: " + social);
        System.out.println("Creative: " + creative);
        System.out.println();
        // display personality type
        System.out.println("Your personality type is: " + result);
        System.out.println();

        switch (result) {
            case "The Leader" -> {
                System.out.println("You are decisive, confident, and action-oriented.");
                System.out.println("You like taking control and achieving goals.");
            }
            case "The Thinker" -> {
                System.out.println("You are analytical, logical, and thoughtful.");
                System.out.println("You prefer planning and understanding before acting.");
            }
            case "The Social Butterfly" -> {
                System.out.println("You are outgoing, empathetic, and people-focused.");
                System.out.println("You thrive on connection and Words of Affirmation.");
            }
            default -> {
                System.out.println("You are imaginative, innovative, and creative.");
                System.out.println("You enjoy expressing ideas in unique ways.");
            }
        }

        System.out.println("============================");

        input.close();
    }

    // input validation method
    private static String getValidAnswer(Scanner scanner) {

        // initialize variables
        String input = "";
        boolean valid = false;

        // while input isn't valid, ask the user again
        while (!valid) {
            input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("A") || input.equals("B") ||
                    input.equals("C") || input.equals("D")) {
                valid = true;
            } else {
                System.out.print("Invalid choice. Please enter A, B, C, or D: ");
            }
        }
        return input;
    }
}
