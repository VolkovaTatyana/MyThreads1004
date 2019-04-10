package hw1004;

import java.util.ArrayList;

/*создайте класс ListContainer. в нем должно быть одно поле типа ArrayList<Integer>.
сделайте геттер для этого поля. В классе Main создайте экземпляр этого класса.
создайте несколько потоков. каждый поток должен через геттер получать ArrayList
из класса ListContainer и добавлять в него 1000 радомных элементов.
в результате выведите размер ArrayList-а*/
public class ListContainer {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
