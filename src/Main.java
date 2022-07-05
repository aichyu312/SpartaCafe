import clerk.Clerk;
import item.Item;

public class Main {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        // 커피 가격 요청 -> 커피 가격 획득
        int coffeePrice = clerk.getPrice("Coffee");
        System.out.println("커피의 가격은 " + coffeePrice + "원 입니다.");

        // 커피 주문 -> 커피 획득
        Item coffee = clerk.order("Coffee", coffeePrice);
        System.out.println(coffee.getName() + "의 주문이 완료 되었습니다");
//
        // 커피 주문 (돈 부족) -> 예외 발생
        try {
            clerk.order("Coffee", coffeePrice - 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//
        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        try {
            clerk.getPrice("Smoothie");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        try {
            clerk.order("Smoothie", 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}