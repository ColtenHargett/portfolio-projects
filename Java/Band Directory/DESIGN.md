![Class diagram](class-diagram.png)

## Class Hierarchy

The program has four classes: BandMember, Band, CLI, and Driver. Band holds many BandMember objects. CLI holds one Band. Driver builds the band and hands it over to the CLI. CLI prints to the screen. None of the classes use get or set methods. Instead objects answer questions themselves, like hasName and plays.

### BandMember

One person in the band, with a name and an instrument.

Attributes:
* private String name: the name of the member.
* private String instrument: the instrument the member plays.

Methods:
* BandMember(String name, String instrument): constructs a member with a name and an instrument.
* boolean hasName(String query): returns true if the name of the member matches the query.
* boolean plays(String query): returns true if the member plays the given instrument.
* String toString(): returns the member as text.

### Band

A named group of band members. This class does the searching. Band is generic (Band<E extends BandMember>), so it can hold BandMember or any class that extends it, like a LeadMember.

Attributes:
* private String name: the name of the band.
* private List<E> members: every member in the band.

Methods:
* Band(String name): constructs an empty band with the given name.
* void add(E member): adds a member to the band.
* E findByName(String query): uses an Iterator to find the first member with that name.
* List<E> findByInstrument(String query): uses an Iterator to find every member who plays that instrument.
* String toString(): returns the band name followed by each member, one per line.

### CLI

Reads the command line arguments and does all of the print output.

Attributes:
* private Band<BandMember> band: the band the user is asking about.

Methods:
* CLI(Band<BandMember> band): constructs a CLI for the given band.
* void run(String[] args): checks the arguments, picks -p, -n, or -i, and prints the result.
* private void printUsage(): prints the usage message.

### Driver

Starts the program.

Methods:
* public static void main(String[] args): builds the band, creates the CLI, and calls run with the arguments. The only static method.

## Error Checking

The CLI prints the usage message when:
* No arguments.
* An unknown option.
* -n or -i with no value after it.
* Extra arguments after the value.

The CLI prints a message that nothing was found when:
* A name with no match.
* An instrument with no match.

## Test Cases

Test band: Dirty Heads

| Command | Expected output |
|---|---|
| java Driver -p | Dirty Heads and all six members |
| java Driver -n "Matt Ochoa" | Matt Ochoa (drums) |
| java Driver -n "matt ochoa" | Matt Ochoa (drums) |
| java Driver -i bass | David Foral (bass) |
| java Driver -i vocals | Jared Watson and Dustin Bushnell (vocals) |
| java Driver -n Nobody | Message that no member was found |
| java Driver -i piano | Message that no member plays piano |
| java Driver | Usage message |
| java Driver -x | Usage message |
| java Driver -n | Usage message |
| java Driver -p extra | Usage message |
| java Driver -n Matt Ochoa | Usage message |
