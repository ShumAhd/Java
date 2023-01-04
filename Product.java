

public class Product {

  private String name;
  private Double price;

  /*
  Поссле сокрытия данных с помощью private доступ к ним закрыт
  Чтоб получить данны можно использовать конструктор
   */
  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  /*
Сетеры set — “устанавливать” (т.е. “метод для установки значения поля”)
Гетеры “get” — “получать” (т.е. “метод для получения значения поля”)
https://javarush.com/groups/posts/1928-getterih-i-setterih
 */
  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  //метод который меняет цену
  public void setPrice(Double value) {
    if (value > 0) {
      this.price = value;
    } else {
      System.out.println("Цена не может быть меньше нуля");
    }
  }
}
