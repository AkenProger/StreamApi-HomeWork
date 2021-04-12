package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {

        List<SeedlingsInformation> seedlingsList = new ArrayList<>();
        seedlingsList.add(new
                SeedlingsInformation("Apple Jannat", 40, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 120,List.of("Очень хорошо","Отлично"),Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Early Apple Red", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.POLISH, 170,List.of("Средний хорошо"," не Отлично"),Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Early Apple Green", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 170,List.of("Удов","Не знаю"),Certificate.NO_CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Barhat Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.OZBEKISTON, 40,List.of("Болот ","Норма"), Certificate.NO_CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Magia Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.AMERICAN, 40,List.of("канча турат экен","Кайду бул кочот"),Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Archa Usuruk", 250, SeedlingTypes.SPRUCE, BirthplaceOfSeedling.KYRGYZSTAN, 350,List.of("Где этот базар","Адрес"),Certificate.CERTIFICATED));
      seedlingsList.add(new
                SeedlingsInformation("Pavlona", 10, SeedlingTypes.WOOD, BirthplaceOfSeedling.EUROPA, 70,List.of("В личку пишите","Где это"),Certificate.NO_CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Pavlona", 10, SeedlingTypes.WOOD, BirthplaceOfSeedling.EUROPA, 70,List.of("В личку пишите","Где это"),Certificate.NO_CERTIFICATED));


        seedlingsList.stream()
                .distinct()
                .limit(5)
                .filter(getWithCertif -> getWithCertif.getCertificate().equals(Certificate.NO_CERTIFICATED))
                .map(g-> g.getSeedlingName()+" NEW Sort")
                .peek(g-> System.out.println(g+" PEEKED"))
                .sorted()
                .forEach(s -> System.out.println(s.toUpperCase()));

        System.out.println("-----------------------");

        seedlingsList.stream()

                .skip(5)//5 запись пропустил
                .forEach(System.out::println);

    }
}
