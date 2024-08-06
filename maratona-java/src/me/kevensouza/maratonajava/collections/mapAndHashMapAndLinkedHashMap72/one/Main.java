package me.kevensouza.maratonajava.collections.mapAndHashMapAndLinkedHashMap72.one;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<String, Byte> playerAttribute = new HashMap<>();
                                                // linkedHashMap mantém a ordem de inserção
        Map<String, Byte> playerAttribute = new LinkedHashMap<>();

        playerAttribute.put("Velocidade", (byte) 72);
        playerAttribute.put("Aceleração", (byte) 74);
        playerAttribute.put("Vigor", (byte) 58);
        playerAttribute.put("Controle", (byte) 77);
        playerAttribute.put("Força", (byte) 54);
        playerAttribute.put("Entrada", (byte) 55);
        playerAttribute.put("Passe", (byte) 78);
        playerAttribute.put("Chute", (byte) 70);

//        System.out.println(playerAttribute);

        playerAttribute.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

//        for (String Key : playerAttribute.keySet()) {
//            System.out.println(Key + ": " + playerAttribute.get(Key));
//        }

//        for (Map.Entry<String, Byte> entry : playerAttribute.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}
