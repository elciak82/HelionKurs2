package enums;

public enum YesNoEnum { //enum definiuje dziedzinę naszych wartości
    YES(true),
    NO(false),
    TAK(true),
    NIE (false),
    Y(true),
    N(false); //mapa

    private Boolean isPositive;

    //Enum mozna wypozarzyć z konstruktor
    YesNoEnum(Boolean value){ //konstruktory enuma sa prywatne, nie można ich wykorzystywać gdzies indziej
        this.isPositive = value; //możemy w ten sposub określić, które enumy sa negartwne a które pozytywne
    }

    public Boolean getPositive() {
        return isPositive;
    }
}
