package homework3;

public class hw3 {
    //1. Написать метод, который меняет два элемента
    // массива местами (массив может быть любого ссылочного типа);
    static <X> void firstpart(X[] array, int one, int two) {
        X that = array[one];
        array[one] = array[two];
        array[two] = that;
    }
    //вторую задачу не успела
}
