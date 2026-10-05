import java.util.Iterator;
import java.util.List;

/**
* Reads the command line arguments and does all of the output.
* @author Colten Hargett
*/
public class CLI {
    private Band<BandMember> band;

    /**
    * Constructs a CLI for the given band.
    *
    * @param  band  the band the user wants
    */
    public CLI(Band<BandMember> band) {
        this.band = band;
    }

    /**
    * Checks the arguments, picks -p, -n, or -i, and prints the result.
    *
    * @param  args  the command line arguments
    */
    public void run(String[] args) {
        if (args.length == 1 && args[0].equals("-p")) {
            System.out.println(band);
        } else if (args.length == 2 && args[0].equals("-n")) {
            BandMember member = band.findByName(args[1]);
            if (member == null) {
                System.out.println("No member named " + args[1] + " was found.");
            } else {
                System.out.println(member);
            }
        } else if (args.length == 2 && args[0].equals("-i")) {
            List<BandMember> matches = band.findByInstrument(args[1]);
            if (matches.isEmpty()) {
                System.out.println("No member plays " + args[1] + ".");
            } else {
                Iterator<BandMember> itr = matches.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
            }
        } else {
            printUsage();
        }
    }

    /**
    * Prints the usage message.
    */
    private void printUsage() {
        System.out.println("Usage: java Driver [-p|-n|-i] <options>");
        System.out.println("  -p               (print)");
        System.out.println("  -n <name>        (lookup by member name)");
        System.out.println("  -i <instrument>  (lookup by instrument)");
    }
}
