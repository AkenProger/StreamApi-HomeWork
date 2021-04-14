package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {

        List<SeedlingsInformation> seedlingsList = new ArrayList<>();
        seedlingsList.add(new
                SeedlingsInformation("Apple Jannat", 40, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 120, List.of("Очень хорошо", "Отлично"), Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Early Apple Red", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.POLISH, 170, List.of("Средний хорошо", " не Отлично"), Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Early Apple Green", 35, SeedlingTypes.WAX_WOOD, BirthplaceOfSeedling.KYRGYZSTAN, 170, List.of("Удов", "Не знаю"), Certificate.NO_CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Barhat Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.OZBEKISTON, 40, List.of("Болот ", "Норма"), Certificate.NO_CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Magia Black", 10, SeedlingTypes.FLOWER, BirthplaceOfSeedling.AMERICAN, 8, List.of("канча турат экен", "Кайду бул кочот"), Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Archa Usuruk", 250, SeedlingTypes.SPRUCE, BirthplaceOfSeedling.KYRGYZSTAN, 210, List.of("Где этот базар", "Адрес"), Certificate.CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Pavlona", 7, SeedlingTypes.WOOD, BirthplaceOfSeedling.EUROPA, 7, List.of("В личку пишите", "Где это"), Certificate.NO_CERTIFICATED));
        seedlingsList.add(new
                SeedlingsInformation("Pavlona", 15, SeedlingTypes.WOOD, BirthplaceOfSeedling.EUROPA, 12, List.of("В личку пишите", "Где это"), Certificate.NO_CERTIFICATED));


        System.out.println("Всего записей:" + seedlingsList.stream().count());

        Optional<SeedlingsInformation> seedlingsInformationOptional = seedlingsList.stream().findFirst();
        System.out.println("Первый запись =" + seedlingsInformationOptional.get());


        boolean isAllHaveCertificate = seedlingsList.stream()
                .allMatch(certif -> certif.getCertificate().equals(Certificate.CERTIFICATED));
        if (isAllHaveCertificate) {
            System.out.println("Все сертифицированы");
        } else {
            System.out.println("Не все сертифицированы");
        }

        System.out.println("-----------------------------anyMatch()");
        int priceLimiter = 10;
        boolean priceFilter = seedlingsList.stream()
                .anyMatch(price -> price.getPrice() <= priceLimiter);
        if (priceFilter) {
            System.out.println("Найдены саженцы дешевле " + priceLimiter + " cом");
            seedlingsList.stream()
                    .filter(priceFiltered -> priceFiltered.getPrice() < priceLimiter)
                    .forEach(show -> System.out.println("Название:" + show.getSeedlingName() + " | Цена:" + show.getPrice() + " | Сорт:" + show.getSeedlingTypes()));
        } else {
            System.out.println("Саженцы из " + BirthplaceOfSeedling.EUROPA + " нет");
        }

        System.out.println("-----------------------------noneMatch()");
        int lifeSizeLimiter = 280;
        boolean isLifeTimeFilter = seedlingsList.stream()
                .noneMatch(liveSize -> liveSize.getSeedlingLifeTime() > lifeSizeLimiter);
        if (isLifeTimeFilter) {
            System.out.println("Не найден сорт саженца с сроком жизни :" + lifeSizeLimiter + " лет:(");
        } else {
            System.out.println("Найден сорт саженца с сроком жизни :" + lifeSizeLimiter + " лет:)");
            seedlingsList.stream()
                    .filter(filter -> filter.getSeedlingLifeTime() >= lifeSizeLimiter)
                    .forEach(show -> System.out.println("Название:" + show.getSeedlingName() + " | Цена:" + show.getPrice() + " | Сорт:" + show.getSeedlingTypes() + " | Срок жизни:" + show.getSeedlingLifeTime() + " лет"));
        }

        System.out.println("--------------min-max");
        System.out.println("Самый дорогой:");
        Optional<SeedlingsInformation> expensiveSeed = seedlingsList.stream().max(Comparator.comparing(SeedlingsInformation::getPrice));
        System.out.println("Название:" + expensiveSeed.get().getSeedlingName() + " | Цена:" + expensiveSeed.get().getPrice() + " сом");
        System.out.println("Самый дешевый:");
        Optional<SeedlingsInformation> notExpensiveSeed = seedlingsList.stream().min(Comparator.comparing(SeedlingsInformation::getPrice));
        System.out.println("Название:" + notExpensiveSeed.get().getSeedlingName() + " | Цена:" + notExpensiveSeed.get().getPrice() + " сом");

    }
}
