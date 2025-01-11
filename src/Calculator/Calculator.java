package Calculator;

public class Calculator {
    /**
     * Метод вычисления суммы покупки со скидкой
     *
     * @param purchaseAmount - сумма покупки (double)
     * @param discountAmount - размер скидки (int)
     * @return - сумма покупки со скидкой (double)
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("The purchase amount is equal to or less than zero");
        }
        if (discountAmount < 0) {
            throw new ArithmeticException("The discount cannot be negative");
        }
        return purchaseAmount - (purchaseAmount * discountAmount) / 100; // Метод должен возвращать сумму покупки со скидкой
    }
}