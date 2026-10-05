/**
* Builds the band and starts the program.
* @author Colten Hargett
*/
public class Driver {
    /**
    * Builds the band and runs it with the arguments.
    *
    * @param  args  the command line arguments
    */
    public static void main(String[] args) {
        Band<BandMember> dirtyHeads = new Band<BandMember>("Dirty Heads");
        dirtyHeads.add(new BandMember("Jared Watson", "vocals"));
        dirtyHeads.add(new BandMember("Dustin Bushnell", "vocals"));
        dirtyHeads.add(new BandMember("Jon Olazabal", "percussion"));
        dirtyHeads.add(new BandMember("Matt Ochoa", "drums"));
        dirtyHeads.add(new BandMember("David Foral", "bass"));
        dirtyHeads.add(new BandMember("Shawn Gonzalez", "keyboards"));

        CLI cli = new CLI(dirtyHeads);
        cli.run(args);
    }
}
