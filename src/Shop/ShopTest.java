package Shop;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setProducts(
                List.of(new Product(400, "Кабачки Ташкент"),
                new Product(55, "Гречка Россия"),
                new Product(130, "Масло подсолнечное рафинированное Слобода Россия"),
                new Product(113, "Яйца куриные")));

        assertThat(shop.getProducts().size()).isEqualTo(4);
        assertThat(shop.getProducts().get(0).title()).isEqualTo("Кабачки Ташкент");
        assertThat(shop.getProducts().get(1).title()).isEqualTo("Гречка Россия");
        assertThat(shop.getProducts().get(2).title()).isEqualTo("Масло подсолнечное рафинированное Слобода Россия");
        assertThat(shop.getProducts().get(3).title()).isEqualTo("Яйца куриные");

        assertThat(shop.getProducts().get(0).cost()).isEqualTo(400);
        assertThat(shop.getProducts().get(1).cost()).isEqualTo(55);
        assertThat(shop.getProducts().get(2).cost()).isEqualTo(130);
        assertThat(shop.getProducts().get(3).cost()).isEqualTo(113);

        assertThat(shop.sortProductsByPrice().get(0).cost()).isEqualTo(55);
        assertThat(shop.sortProductsByPrice().get(3).cost()).isEqualTo(400);

        assertThat((shop.getMostExpensiveProduct().cost())).isEqualTo(400);
        assertThat((shop.getMostExpensiveProduct().title())).isEqualTo("Кабачки Ташкент");
    }
}