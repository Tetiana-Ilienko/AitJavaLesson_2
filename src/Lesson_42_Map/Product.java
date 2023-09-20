package Lesson_42_Map;

import java.util.Objects;

public class Product {
    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) { // переопределяем метод equals()
        if (this == o) return true; // ели ссылки совпадают - возвращаем true
        if (!(o instanceof Product)) return false; //  если объект не является классом продукт
        // возвращаем false
        Product product = (Product) o; // выполняем приведение (кастинг) объекта o к типу Product.
        return name.equals(product.name) && description.equals( product.description);
        /*
        name.equals(product.name): Здесь сравниваются значения свойства name текущего объекта
        Product (представленного как this) и объекта product. Метод .equals() сравнивает строки на равенство
        и возвращает true, если обе строки содержат одинаковые символы в одинаковом порядке. В данном случае,
        это сравнение проверяет, равны ли имена текущего продукта и продукта, с которым сравнивается текущий.

        description.equals(product.description): Эта часть аналогична предыдущей, но сравнивает значения
        свойства description. Таким образом, она проверяет, равны ли описания текущего продукта и продукта,
        с которым сравнивается текущий.

        Общее выражение name.equals(product.name) && description.equals(product.description) означает,
        что оба свойства name и description текущего объекта Product должны быть равны соответствующим свойствам
        объекта product, чтобы вернуть true. Если хотя бы одно из свойств отличается, выражение вернет false,
        указывая на то, что объекты различны.
         */
    }
    /*
    В контексте языка Java, приведение типов (casting) позволяет изменить тип переменной или объекта с
    одного типа на другой. В данном случае, переменная o рассматривается как объект типа Product, даже если изначально
    она была объявлена как объект более общего типа, например, как Object.
    Такое приведение типов может потребоваться, если у вас есть объект более общего класса, а вы хотите обратиться
    к его методам или свойствам, которые определены только в более конкретных подклассах, таких как Product.

    Если объект o не является экземпляром Product или его подкласса, и попытка приведения к типу Product невозможна,
    то это приведет к возникновению исключения ClassCastException.

     */

    @Override
    public int hashCode() { // переопределяем метод
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
