import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    // добавляем актёра в лист спектакля и заодно проверяем совпадение
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: такой актёр уже добавлен: " + actor);
            return;
        }
        listOfActors.add(actor);
    }

    // заменяем актёра по фамилии, если он не найден, выводим предупреждние
    public void replaceActor(Actor newActor, String surnameToReplace) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Предупреждение: актёр с фамилией \"" + surnameToReplace + "\" не найден в спектакле \"" + title + "\".");
            return;
        }
        // если новый актёр уже есть в списке и он не тот, которого мы заменяем, предупреждаем
        if (listOfActors.contains(newActor) && !listOfActors.get(index).equals(newActor)) {
            System.out.println("Предупреждение: новый актёр уже участвует в спектакле: " + newActor);
            return;
        }
        listOfActors.set(index, newActor);
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  (список пуст)");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println("  - " + actor);
        }
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director);
    }
}
