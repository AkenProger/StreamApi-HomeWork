package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {



        List<SeedlingsInformation> seedlingsList = new ArrayList<>();
        seedlingsList.add(new
                SeedlingsInformation("Apple Jannat", 40, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 120,List.of("Очень хорошо","Отлично")));
        seedlingsList.add(new
                SeedlingsInformation("Early Apple Red", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.POLISH, 170,List.of("Средний хорошо"," не Отлично")));
        seedlingsList.add(new
                SeedlingsInformation("Early Apple Green", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 170,List.of("Удов","Не знаю")));
        seedlingsList.add(new
                SeedlingsInformation("Barhat Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.OZBEKISTON, 40,List.of("Болот ","Норма")));
        seedlingsList.add(new
                SeedlingsInformation("Magia Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.AMERICAN, 40,List.of("канча турат экен","Кайду бул кочот")));
        seedlingsList.add(new
                SeedlingsInformation("Archa Usuruk", 250, SeedlingTypes.SPRUCE, BirthplaceOfSeedling.KYRGYZSTAN, 350,List.of("Где этот базар","Адрес")));
        seedlingsList.add(new
                SeedlingsInformation("Pavlona", 10, SeedlingTypes.WOOD, BirthplaceOfSeedling.EUROPA, 70,List.of("В личку пишите","Где это")));
        seedlingsList.add(new
                SeedlingsInformation("Green Semerenko", 40, SeedlingTypes.WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 40,List.of("Сертификат есть","А Лицензия")));



/*     Stream<Object> seedlings = Stream.builder()
                .add(new SeedlingsInformation("Apple Jannat", 40, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 120))
                .add(new SeedlingsInformation("Early Apple Red", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.POLISH, 170))
                .add(new SeedlingsInformation("Early Apple Green", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 170))
                .add(new SeedlingsInformation("Barhat Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.OZBEKISTON, 40))
                .add(new SeedlingsInformation("Magia Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.AMERICAN, 40))
                .add(new SeedlingsInformation("Archa Usuruk", 250, SeedlingTypes.SPRUCE, BirthplaceOfSeedling.KYRGYZSTAN, 350))
                .add(new SeedlingsInformation("Pavlona", 10, SeedlingTypes.WOOD, BirthplaceOfSeedling.EUROPA, 70))
                .add(new SeedlingsInformation("Green Semerenko", 40, SeedlingTypes.WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 40))
                .build();*/


        System.out.println("Список саженцов:");
      seedlingsList.forEach(h-> System.out.println(h));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("----Список саженцов из " + BirthplaceOfSeedling.KYRGYZSTAN + ":");
        seedlingsList.stream()
                .filter((country) -> country.getBirthplaceOfSeedling().equals(BirthplaceOfSeedling.KYRGYZSTAN))
                .forEach(k-> System.out.println(k));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("----Список саженцов из " + BirthplaceOfSeedling.KYRGYZSTAN + " который живут больше 50-лет");
        seedlingsList.stream()
                .filter(lifeTime -> lifeTime.getSeedlingLifeTime() > 50)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("----Сортировка по возрастанию цены");
        List<SeedlingsInformation> sortByPrice = seedlingsList.stream()
                .sorted(Comparator.comparingInt(SeedlingsInformation::getSeedlingLifeTime)).collect(Collectors.toList());

        System.out.println("---метод limit()");
        sortByPrice.stream().limit(6).forEach(System.out::println);


        System.out.println("---метод max()");
        sortByPrice.stream().max(Comparator.comparingInt(SeedlingsInformation::getSeedlingLifeTime)).stream().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("---метод map()");




//Увеличить цены у кого больше 50 map () используется только для преобразования.
      seedlingsList.stream()
              .filter(seedlingsInformation -> seedlingsInformation.getPrice() > 50)
              .map(SeedlingsInformation::getPrice)
              .mapToInt(addPrice-> (int) (addPrice + 1000))
              .forEach(show-> System.out.println(show));

      //	flatMap () используется как для преобразования, так и для отображения. показать список плохих коментариев
        seedlingsList.stream()
                .flatMap(comment -> comment.getComments().stream())
                .filter(showBadComments -> showBadComments.startsWith("Не"))
                .forEach(s -> System.out.println(s));

    }
}
