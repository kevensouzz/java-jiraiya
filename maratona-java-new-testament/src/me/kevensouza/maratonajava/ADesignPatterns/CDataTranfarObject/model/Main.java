package me.kevensouza.maratonajava.ADesignPatterns.CDataTranfarObject.model;

import me.kevensouza.maratonajava.ADesignPatterns.ABuilder.A.model.Person;
import me.kevensouza.maratonajava.ADesignPatterns.BSingleton.BLazyInitialization.model.Aircraft;
import me.kevensouza.maratonajava.ADesignPatterns.CDataTranfarObject.model.dto.ReportDto;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = Aircraft.getInstance();

        Person person = Person.Builder.aPerson()
                .name("Ging Frecss")
                .email("gingfrecss@greedisland.com")
                .age((short) 24)
                .build();

        ReportDto.ReportDtoBuilder.aReportDto()
                .AircraftName(aircraft.getName())
                .PersonName(person.getName())
                .PersonAge(person.getAge());
    }
}
