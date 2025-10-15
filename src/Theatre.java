import People.*;
import Show.*;

public class Theatre {
    public static void main(String[] args) {
        // создаём актёров
        Actor actor1 = new Actor("Константин", "Алексеев", Gender.MALE, 183);
        Actor actor2 = new Actor("Маргарита", "Краснова", Gender.FEMALE, 162);
        Actor actor3 = new Actor("Дмитрий", "Волконский", Gender.MALE, 179);

        // создаём режиссёров
        Director director1 = new Director("Вячеслав", "Соколовский", Gender.MALE, 12);
        Director director2 = new Director("Елизавета", "Никонова", Gender.FEMALE, 28);

        // автор музыки и хореограф
        String musicAuthor = "Композитор Шопенгауэр";
        String choreographer = "Хореограф Алейникова";

        Show ordinaryShow = new Show("Театральная пьеса \"Чайка\"", 128, director1);
        Opera operaShow = new Opera("Опера \"Аида\"", 135, director2, musicAuthor,
                "Текст либретто оперы: исполняется на итальянском языке с русскими субтитрами.", 30);
        Ballet balletShow = new Ballet("Балет \"Все пути ведут на север\"", 90, director1, musicAuthor,
                "Каждый из танцовщиков проявит себя, отважно обнажая душевные переживания сомнений, страхов, теплоты, чуткости и отвержения.", choreographer);

        // распределяем актёров по спектаклям
        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        // выводим список актёров для каждого спектакля
        ordinaryShow.printActors();
        ordinaryShow.printDirectorInfo();
        System.out.println();

        operaShow.printActors();
        operaShow.printDirectorInfo();
        System.out.println();

        balletShow.printActors();
        balletShow.printDirectorInfo();
        System.out.println();

        // заменяем актёра: в опере заменим Волконского на Алексеева
        System.out.println("Заменяем актёра в опере: заменяем 'Волконский' на 'Алексеев'.");
        operaShow.replaceActor(actor1, "Волконский");
        operaShow.printActors();
        System.out.println();

        // меняем несуществующего актера и выводим предупреждение
        System.out.println("Пытаемся заменить несуществующего актёра в обычном шоу:");
        ordinaryShow.replaceActor(actor3, "Громов"); // Громова нет, печатается предупреждение
        System.out.println();

        // распечатаем либретто для оперы и балета
        operaShow.printLibretto();
        System.out.println();
        balletShow.printLibretto();
    }
}

