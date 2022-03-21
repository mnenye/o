package homework2;

public class Main {
    public static void main(String[] args) {
        //3. В методе main() вызвать полученный метод, обработать возможные
        // исключения MyArraySizeException и MyArrayDataException и вывести
        // результат расчета.
        String[][] arr = new String[][]{{"0", "2", "2", "2"}, {"0", "6", "0", "3"}, {"1", "2", "3", "4"}, {"0", "1", "6", "3"}};
        try {
            try {
                int resultat = firstpart(arr);
                System.out.println(resultat);
            } catch (MyArraySizeException a) {
                System.out.println("размер строкового массива превышен");
            }
        }
        catch (MyArrayDataException a) {
            System.out.println("введено ошибочное значение");
            System.out.println("ошибочное значение введено в ячейке:" + a.i + "x" + a.j);
        }

    }

    //1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    public static int firstpart(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            //2. Далее метод должен пройтись по всем элементам массива,
            // преобразовать в int и просуммировать. Если в каком-то
            // элементе массива преобразование не удалось (например,
            // в ячейке лежит символ или текст вместо числа), должно быть
            // брошено исключение MyArrayDataException с детализацией, в какой
            // именно ячейке лежат неверные данные.
            for (int x = 0; x < arr[i].length; x++) {
                try {
                    count = count + Integer.parseInt(arr[i][x]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, x);
                }
            }

        }
        return count;
    }

}


