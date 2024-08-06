package me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two;

import me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model.Player;
import me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model.enums.AttributeKey;
import me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.two.model.enums.Position;

public class Main {
    public static void main(String[] args) {
        Player keven = new Player("Keven Souza", 22, Position.MIDFIELDER, "Brazil", "Corinthians");

        keven.putAttribute(AttributeKey.SPEED, (byte) 97);
        keven.putAttribute(AttributeKey.ACELERATION, (byte) 97);
        keven.putAttribute(AttributeKey.STAMINA, (byte) 95);
        keven.putAttribute(AttributeKey.CONTROL, (byte) 92);
        keven.putAttribute(AttributeKey.STRENGHT, (byte) 64);
        keven.putAttribute(AttributeKey.DEFENSE, (byte) 47);
        keven.putAttribute(AttributeKey.PASS, (byte) 87);
        keven.putAttribute(AttributeKey.SHOT, (byte) 89);
        keven.putAttribute(AttributeKey.REFLEXES, (byte) 65);
        keven.putAttribute(AttributeKey.FLEXIBILITY, (byte) 75);

        System.out.println(keven);
    }
}
