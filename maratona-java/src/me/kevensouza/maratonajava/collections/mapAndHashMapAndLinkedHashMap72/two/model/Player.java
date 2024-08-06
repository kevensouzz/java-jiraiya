package me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model;

import me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model.enums.AttributeKey;
import me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model.enums.Position;
import me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model.exceptions.MissingAttributes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private final long id;
    private String name;
    private int age;
    private Byte overall;
    private Map<AttributeKey, Byte> attributes = new LinkedHashMap<AttributeKey, Byte>();
    private Position position;
    private String country;
    private String club;

    public Player(String name, int age, Position position, String country, String club) {
        this.id = ThreadLocalRandom.current().nextLong(100_000, 999_999);
        this.name = name;
        this.age = age;
        this.position = position;
        this.country = country;
        this.club = club;
    }

    public Player(String name, int age, Map<AttributeKey, Byte> attributes, Position position, String country, String club) {
        this.id = ThreadLocalRandom.current().nextLong(100_000, 999_999);
        this.name = name;
        this.age = age;
        this.attributes.putAll(attributes);
        this.position = position;
        this.country = country;
        this.club = club;
        overallCalc();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", overall=" + getOverall() +
                ", attributes=" + attributes +
                ", position=" + position +
                ", country='" + country + '\'' +
                ", club='" + club + '\'' +
                '}';
    }

    public void putAttribute(AttributeKey attribute, Byte value) {
        this.attributes.putIfAbsent(attribute, value);
    }

    public void putAttributes(Map<AttributeKey, Byte> attributes) {
        this.attributes.putAll(attributes);
    }

    public void removeAttribute(AttributeKey attribute) {
        this.attributes.remove(attribute);
    }

    public void clearAttributes() {
        this.attributes.clear();
    }

    public Map<AttributeKey, Byte> getAttributes() {
        return attributes;
    }

    public Byte getAttribute(AttributeKey attribute) {
        return attributes.get(attribute);
    }

    public void overallCalc() {
        short relevantAttributes = 0;

        for (AttributeKey attribute : this.attributes.keySet()) {
            if (this.position.equals(Position.GOALKEEPER) && (attribute.equals(AttributeKey.STAMINA) || attribute.equals(AttributeKey.DEFENSE))) {
                continue;
            } else if (!this.position.equals(Position.GOALKEEPER) && (attribute.equals(AttributeKey.FLEXIBILITY) || attribute.equals(AttributeKey.REFLEXES))) {
                continue;
            }
            relevantAttributes++;
        }

        if (relevantAttributes != 8) {
            throw new MissingAttributes("There are missing attributes for the player to calculate the overall.");
        }

        short overallSum = 0;

        for (AttributeKey attribute : this.attributes.keySet()) {
            if (!this.position.equals(Position.GOALKEEPER) && (attribute.equals(AttributeKey.FLEXIBILITY) || attribute.equals(AttributeKey.REFLEXES))) {
                continue;
            } else if (this.position.equals(Position.GOALKEEPER) && (attribute.equals(AttributeKey.STAMINA) || attribute.equals(AttributeKey.DEFENSE))) {
                continue;
            }
            overallSum += attributes.get(attribute);
        }
        this.overall = (byte) (overallSum / 7.57);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Byte getOverall() {
        if (this.overall == null) {
            overallCalc();
        }
        return overall;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
