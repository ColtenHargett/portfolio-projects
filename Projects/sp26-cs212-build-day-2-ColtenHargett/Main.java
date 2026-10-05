import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static ArrayList<Player> loadPlayersFromFile(String filename) {
        ArrayList<Player> players = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(new File(filename));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String name = parts[0];
                    String position = parts[1];
                    double avgPoints = Double.parseDouble(parts[2]);

                    Player player = new Player(name, position, avgPoints);
                    players.add(player);
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return players;
    }

    public static void saveTeamToFile(Team team, String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);

            writer.println(team.getTeamName());
            for (Player p : team.getRoster()) {
                writer.println(p.getName() + "," + p.getPosition() + "," + p.getAvgPoints());
            }

            writer.close();
            System.out.println("Team saved successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving file!");
        }
    }

    public static Team loadTeamFromFile(String filename) {
        Team loadedTeam = null;

        try {
            Scanner fileScanner = new Scanner(new File(filename));

            if (fileScanner.hasNextLine()) {
                String teamName = fileScanner.nextLine();
                loadedTeam = new Team(teamName);

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");

                    if (parts.length == 3) {
                        String name = parts[0];
                        String position = parts[1];
                        double avgPoints = Double.parseDouble(parts[2]);

                        Player player = new Player(name, position, avgPoints);
                        loadedTeam.addPlayer(player);
                    }
                }
            }

            fileScanner.close();
            System.out.println("Team loaded successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error loading file!");
        }

        return loadedTeam;
    }

    public static HashMap<String, ArrayList<Player>> organizeByPosition(ArrayList<Player> players) {
        HashMap<String, ArrayList<Player>> positionMap = new HashMap<>();

        for (Player p : players) {
            String position = p.getPosition();

            if (!positionMap.containsKey(position)) {
                positionMap.put(position, new ArrayList<Player>());
            }

            positionMap.get(position).add(p);
        }

        return positionMap;
    }

    public static void displayPlayersByPosition(ArrayList<Player> players) {
        HashMap<String, ArrayList<Player>> positionMap = organizeByPosition(players);

        System.out.println("\n=== AVAILABLE PLAYERS BY POSITION ===");

        for (String position : positionMap.keySet()) {
            System.out.println("\n" + position + ":");
            ArrayList<Player> group = positionMap.get(position);

            for (Player p : group) {
                System.out.println("- " + p);
            }
        }
    }

    public static void displaySeasonStats(Team team) {
        int weeks = 4;
        int numPlayers = team.getRoster().size();

        if (numPlayers == 0) {
            System.out.println("Your team is empty. Draft players first.");
            return;
        }

        double[][] stats = new double[numPlayers][weeks];
        Random rand = new Random();

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < weeks; j++) {
                Player p = team.getRoster().get(i);
                stats[i][j] = p.getAvgPoints() + (rand.nextDouble() * 10 - 5);

                if (stats[i][j] < 0) {
                    stats[i][j] = 0;
                }
            }
        }

        System.out.println("\n=== SEASON STATS (Last 4 Weeks) ===");
        System.out.printf("%-20s", "Player");
        for (int w = 1; w <= weeks; w++) {
            System.out.printf("Week %d\t", w);
        }
        System.out.println();

        for (int i = 0; i < numPlayers; i++) {
            System.out.printf("%-20s", team.getRoster().get(i).getName());
            for (int j = 0; j < weeks; j++) {
                System.out.printf("%.1f\t", stats[i][j]);
            }
            System.out.println();
        }
    }

    public static void viewAvailablePlayers(ArrayList<Player> availablePlayers) {
        System.out.println("\n=== AVAILABLE PLAYERS ===");

        if (availablePlayers.size() == 0) {
            System.out.println("No players available.");
            return;
        }

        for (int i = 0; i < availablePlayers.size(); i++) {
            System.out.println((i + 1) + ". " + availablePlayers.get(i));
        }
    }

    public static void draftPlayer(ArrayList<Player> availablePlayers, Team myTeam, Scanner scanner) {
        if (availablePlayers.size() == 0) {
            System.out.println("No players left to draft.");
            return;
        }

        viewAvailablePlayers(availablePlayers);
        System.out.print("Enter the number of the player you want to draft: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice >= 1 && choice <= availablePlayers.size()) {
            Player drafted = availablePlayers.remove(choice - 1);
            myTeam.addPlayer(drafted);
            System.out.println(drafted.getName() + " drafted successfully!");
        } else {
            System.out.println("Invalid player selection.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> availablePlayers = loadPlayersFromFile("players.txt");
        Team myTeam = new Team("My Team");

        boolean running = true;

        while (running) {
            System.out.println("\n=== FANTASY TEAM MANAGER ===");
            System.out.println("1. View Available Players");
            System.out.println("2. Draft a Player");
            System.out.println("3. View My Team");
            System.out.println("4. View Season Stats");
            System.out.println("5. Calculate Team Score");
            System.out.println("6. Save Team to File");
            System.out.println("7. Load Team from File");
            System.out.println("8. View Players Grouped by Position");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewAvailablePlayers(availablePlayers);
                    break;

                case 2:
                    draftPlayer(availablePlayers, myTeam, scanner);
                    break;

                case 3:
                    myTeam.displayRoster();
                    break;

                case 4:
                    displaySeasonStats(myTeam);
                    break;

                case 5:
                    System.out.printf("Total Team Score: %.1f pts/game\n", myTeam.calculateTeamScore());
                    break;

                case 6:
                    saveTeamToFile(myTeam, "saved_team.txt");
                    break;

                case 7:
                    Team loadedTeam = loadTeamFromFile("saved_team.txt");
                    if (loadedTeam != null) {
                        myTeam = loadedTeam;
                    }
                    break;

                case 8:
                    displayPlayersByPosition(availablePlayers);
                    break;

                case 9:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}