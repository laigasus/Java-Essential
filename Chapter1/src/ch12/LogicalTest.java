package ch12;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        print(value, num1, i);

        boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
        print(value2, num1, i);

        boolean value3 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        print(value3, num1, i);

        boolean value4 = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
        print(value4, num1, i);
    }

    static void print(Object... obj){
        StringBuilder sb= new StringBuilder();
        for(Object o : obj){
            sb.append(o).append('\n');
        }
        
        System.out.print(sb);
    }
}
