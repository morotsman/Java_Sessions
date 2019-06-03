package java_session;

import static java.util.Arrays.asList;
import static java_session.model.Genre.*;
import static java_session.model.Tag.tag;

import java.util.stream.Stream;

import java_session.model.Record;

/**
 * Hello world!
 *
 */
public class App
{
    //https://www.rollingstone.com/music/music-lists/500-greatest-albums-of-all-time-156826/

    private static Stream<Record> recordCollection() {
        return Stream.of(
                new Record(PUNK, "Sex Pistols", "Never Mind the Bollocks, Here's the Sex Pistols", 1977, asList(tag("Rolling Stone", "41"))),
                new Record(GOTHIC, "The Cure", "Disintegration", 1989, asList(tag("Rolling Stone", "326"))),
                new Record(ALTERNATIVE_DANCE, "Primal Scream", "Screamadelica", 1991, asList()),
                new Record(POP, "Primal Scream", "Primal Scream", 1989, asList()),
                new Record(POP, "Smiths", "The Queen Is Dead", 1986, asList(tag("Rolling Stone", "218"), tag("Niklas","My favorite album"))),
                new Record(ALTERNATIVE_ROCK, "Sonic Youth", "Daydream Nation", 1992, asList(tag("Rolling Stone", "328"))),
                new Record(POP, "The Beach Boys", "Pet Sounds", 1966, asList(tag("Rolling Stone", "2"))),
                new Record(PUNK, "The Clash", "London Calling", 1979, asList(tag("Rolling Stone", "41"))));
    }

    public static void main(String[] args) {
        recordCollection().forEach(System.out::println);
    }
}
