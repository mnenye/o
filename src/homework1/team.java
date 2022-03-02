package homework1;

public class team {
    //название команды
//массив из четырех участников — в конструкторе можно сразу всех участников указывать)

    public static void main(String[] args){

        course c = new course(); // Создаем полосу препятствий
        System.out.println("создана полоса препятствий");
        System.out.println("**************************");
        team team = new team(); // Создаем команду
        //название команды
        teamname("смешарики");
        teammates("Ежик", "Лосяш", "Каркарыч", "Совунья");
        c.doIt(team); // Просим команду пройти полосу
        System.out.println("***************");
        System.out.println("команда проходит препятствие");
        distantion("первый игрок прошел полосу препятствий","второй игрок не прошел полосу препятствий", "третий игрок прошел полосу препятствий", "четвертая игрокиня прошла полосу препятствий");
        System.out.println("********************************************");
        team.showResults(); // Показываем результаты

    }

    //метод вывода информации обо всех членах команды
    private static void teammates(String first, String second, String third, String fourth) {
        System.out.println("члены команды - " + first + ", " + second + ", " + third + ", " + fourth);
    }

    //название команды
    private static void teamname(String name){
        System.out.println("создана команда - " + name);
    }

    //метод для вывода информации о членах команды, прошедших дистанцию
    private static void distantion(String one, String two, String three, String four){
        System.out.println(one + ", " + two + ", " + three + ", " + four);
    }

    private void showResults() {
        System.out.println("побеждает команда - смешарики");
    }
}
