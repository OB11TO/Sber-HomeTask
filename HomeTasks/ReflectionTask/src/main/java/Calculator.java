

public interface Calculator{
    /**
     * Расчет факториала числа.
     * @param number
     */
    @Cache
    @Metric
    int calc (int number);
}