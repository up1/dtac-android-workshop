package cc.somkiat.dtaccalculator;

public class Calculator {

    public int บวก(int input1, int input2) {
        return input1 + input2;
    }

    public int บวก2(int input1, int input2) {
        return input1 + input2;
    }

    public int ลบ(int input1, int input2) {
        return input1 - input2;
    }

    public int คูณ(int input1, int input2) {
        return input1 * input2;
    }

    public int หาร(int input1, int input2) {
        if(input2 == 0){
            throw new XXXXException();
        }
        return input1/input2;
    }
}
