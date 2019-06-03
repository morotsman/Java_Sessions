package java_session.model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Record {

	final Genre genre;
	final String artist;
	final int yearOfRecording;
	final String name;
	final List<Tag> tags;

	public Record(Genre genre, String artist, String name, int yearOfRecording, List<Tag> tags) {
		this.genre = genre;
		this.artist = artist;
		this.yearOfRecording = yearOfRecording;
		this.name = name;
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getArtist() {
		return artist;
	}

	public int getYearOfRecording() {
		return yearOfRecording;
	}

	public List<Tag> getTags() {
		return tags;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Record record = (Record) o;
		return yearOfRecording == record.yearOfRecording &&
				genre == record.genre &&
				Objects.equals(artist, record.artist) &&
				Objects.equals(name, record.name) &&
				Objects.equals(tags, record.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, artist, yearOfRecording, name, tags);
	}

	@Override
	public String toString() {
		return "Record{" +
				"genre=" + genre +
				", artist='" + artist + '\'' +
				", yearOfRecording=" + yearOfRecording +
				", name='" + name + '\'' +
				", tags=" + tags +
				'}';
	}
}
