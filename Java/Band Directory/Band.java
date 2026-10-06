import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* A named group of band members that can search itself.
* E can be BandMember or any class that extends it.
* @author Colten Hargett
*/
public class Band<E extends BandMember> {
    private String name;
    private List<E> members;

    /**
    * Constructs an empty band with a name.
    *
    * @param  name  the name of the band
    */
    public Band(String name) {
        this.name = name;
        this.members = new ArrayList<E>();
    }

    /**
    * Adds a member to the band.
    *
    * @param  member  the member to add (a BandMember or subclass)
    */
    public void add(E member) {
        members.add(member);
    }

    /**
    * Finds the first member with the given name.
    *
    * @param  query  the name to look for
    * @return        the matching member (null if there is no match)
    */
    public E findByName(String query) {
        Iterator<E> itr = members.iterator();
        while (itr.hasNext()) {
            E member = itr.next();
            if (member.hasName(query)) {
                return member;
            }
        }
        return null;
    }

    /**
    * Finds every member who plays the given instrument.
    *
    * @param  query  the instrument to look for
    * @return        the matching members (empty if there is no match)
    */
    public List<E> findByInstrument(String query) {
        List<E> matches = new ArrayList<E>();
        Iterator<E> itr = members.iterator();
        while (itr.hasNext()) {
            E member = itr.next();
            if (member.plays(query)) {
                matches.add(member);
            }
        }
        return matches;
    }

    /**
    * Returns the band information.
    *
    * @return  the band name followed by each member
    */
    public String toString() {
        StringBuilder text = new StringBuilder(name);
        Iterator<E> itr = members.iterator();
        while (itr.hasNext()) {
            text.append("\n").append(itr.next());
        }
        return text.toString();
    }
}
