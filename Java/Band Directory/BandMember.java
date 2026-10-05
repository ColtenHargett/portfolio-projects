/**
* One member of a band, with a name and an instrument.
* @author Colten Hargett
*/
public class BandMember {
    private String name;
    private String instrument;

    /**
    * Constructs a member with a name and an instrument.
    *
    * @param  name        the name of the member
    * @param  instrument  the instrument the member plays
    */
    public BandMember(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    /**
    * Checks whether the name of the member matches the query, while ignoring case.
    *
    * @param  query  the name to look for
    * @return        true if the name matches the query
    */
    public boolean hasName(String query) {
        return name.equalsIgnoreCase(query);
    }

    /**
    * Checks whether the member plays the given instrument, ignoring case.
    *
    * @param  query  the instrument to look for
    * @return        true if the member plays that instrument
    */
    public boolean plays(String query) {
        return instrument.equalsIgnoreCase(query);
    }

    /**
    * Returns the member as text.
    *
    * @return  the members name followed by instrument
    */
    public String toString() {
        return name + " (" + instrument + ")";
    }
}
