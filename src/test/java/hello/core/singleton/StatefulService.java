package hello.core.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 필드

    public void order(String name, int price) {
        System.out.println("name = " + name + " price " + price);
        this.price = price; // 공유필드이기 때문에 쓰레드 문제가 발생
        // return price; // stateless 한 설계를 위해서는 이러한 방식이 필요함.
    }

    public int getPrice() {
        return price;
    }
}
