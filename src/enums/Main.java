package enums;

public class Main {
    public static void main(String[] args) {
        YesNoEnum value = YesNoEnum.NIE;
        Boolean isPositive = value.getPositive();
        for (YesNoEnum val: YesNoEnum.values()) {
            System.out.println(val.toString());
        }
    }

}
