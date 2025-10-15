package People;

import java.util.Objects;

public class Actor extends Person {
    private int height; // рост в сантиметрах

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    // выводим актёра (имя, фамилия, рост)
    @Override
    public String toString() {
        return super.toString() + " (" + height + " см)";
    }

    // сравниваем актеров, если совпадают имя, фамилия и рост, значит они одинаковые
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
