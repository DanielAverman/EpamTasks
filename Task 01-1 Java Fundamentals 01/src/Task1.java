public class Task1 {
    //Составить линейную программу,
    // печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
    //
    //Сумма двух первых цифр заданного четырехзначного числа
    //равна сумме двух его последних цифр.

    public static void main(String[] args) {
        int number = 3434;
        System.out.println(number % 100 == number / 100);
    }
}
