package ch08;

public class Powder extends Material {

    @Override
    public void doPrinting() {
        System.out.println(this.getClass().getSimpleName() + " 재료로 출력합니다");
    }

    public String toString() {
        return "재료는 " + this.getClass().getSimpleName() + " 입니다";
    }
}