

public interface Calculator{
    /**
     * Расчет факториала числа.
     * @param number
     */
    @Cache
    int calc (int number);
}