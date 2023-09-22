package Agorithm.Reference.Conversion;

public class Primitive_Type {

    public void Type_To_String() {

        // 방법1. String.valueOf()
        int number1 = 1234;

        String str1 = String.valueOf(number1);

        // 방법2. + ""
        int number2 = 1234;

        // 문자열과 원시타입을 더하면 문자열로 변환됨.
        // 성능적인 면에서는 방법1을 사용하는게 더 효율적임.
        String str2 = "" + number2;
    }

    public void String_To_Type() {

        // 방법1. Wrapper.parse{T}()
        String str1 = "1234";

        int num1 = Integer.parseInt(str1);
    }

    public void Char_To_Int() {

        // 방법1. char - '0'
        char c1 = '1';
        int n1 = c1 - '0';

        // 방법2. Character.getNumericValue()
        char c2 = '1';
        int n2 = Character.getNumericValue(c2);
    }


}
