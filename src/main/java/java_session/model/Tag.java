package java_session.model;

import java.util.Objects;

public class Tag {

	private final String name;
	private final String value;

	private Tag(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public static Tag tag(String name, String value) {
		return new Tag(name, value);
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Tag tag = (Tag) o;
		return Objects.equals(name, tag.name) &&
				Objects.equals(value, tag.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}

	@Override
	public String toString() {
		return "Tag{" +
				"name='" + name + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
