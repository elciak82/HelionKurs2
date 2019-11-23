package genericTypes;

public class Fruits<T extends Fruit> {
    // Fruit - zdefiniowanie typu po którym nasze owoce maja dziedziczyć
    //zabezpieczenie porgramu - pilnowanie typu
    private T fruit;

    public T getFruit() {
        return fruit;
    }

    public Fruits setFruit(T fruit) {
        this.fruit = fruit;
        return this;
    }
    //tworzenie klasy dla specyficznego typu obiektów
}
