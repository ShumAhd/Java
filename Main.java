/*
 * Семинар ООП урок 1 (Морозов), начало с 17 минуты
 */
public class Main {

  public static void main(String[] args) {
//    Product p = new Product();
//    p.name = "Чипсы";
//    p.price = 60.0;
//    System.out.printf("%s, %.2f\n", p.name, p.price);
//    p.name = "Шоколад";
//    System.out.printf("%s, %.2f\n", p.name, p.price);

    /*
    Инкапсуляция делает так чтоб нельзя было с другого места вот так взять и поменять данные
      Сетеры set — “устанавливать” (т.е. “метод для установки значения поля”)
      Гетеры “get” — “получать” (т.е. “метод для получения значения поля”)
      https://javarush.com/groups/posts/1928-getterih-i-setterih
     */
    Product p = new Product("Чипсы", 60.0);
    System.out.printf("%s,%.2f\n", p.getName(), p.getPrice());
    p.setPrice(100.0);
    System.out.printf("%s, %.2f", p.getName(), p.getPrice() );
  }
}
