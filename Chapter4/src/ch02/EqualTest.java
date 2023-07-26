package ch02;

@SuppressWarnings("unused")
public class EqualTest {

    public static void main(String[] args) {
        Student Lee = new Student(100, "Lee");
        Student Lee2 = Lee;
        Student Shun = new Student(100, "Lee");
        Student lee3 = Lee.clone();
        System.out.println(Lee == Shun);
        System.out.println(Lee.equals(Shun));

        System.out.println(Lee.hashCode());
        System.out.println(Shun.hashCode());

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

    }
}
