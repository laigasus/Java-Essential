package ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello", s2 = "World";
        StringConCatImpl normalInterfaceImpl = new StringConCatImpl();
        normalInterfaceImpl.makeString(s1, s2);

        StringConcat lambdaWithAnnotation = (str1, str2) -> {
            System.out.println(str1 + "," + str2);
        };

        lambdaWithAnnotation.makeString(s1, s2);

        StringConcat anonymousInnerType = new StringConcat() {
            @Override
            public void makeString(String a, String b) {
                System.out.println(a + "," + b);
            }
        };

        anonymousInnerType.makeString(s1, s2);
    }

}
