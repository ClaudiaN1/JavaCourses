package base;

public enum NumbersEnum {

    first(1),
    second(2),
    third(3);

   private  int value ;

    public int getValue() {
        return value;
    }

    NumbersEnum(int value) {
        this.value = value;


    }

    public static void main(String[] args) {

        NumbersEnum[] enumValues = NumbersEnum.values();
       // System.out.println(values);
       // System.out.println(first.name());
        for (int i = 0; i < enumValues.length; i++) {

            NumbersEnum curentElement = enumValues[i];
            System.out.println();
            System.out.println(enumValues[i].name());


            System.out.println(" Current lement type : " +
                                curentElement.getClass().getSimpleName());
            System.out.println(curentElement.value);


        }
    }










}
