import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskBoard taskBoard = new TaskBoard();

        Employee emp1 = new Employee("Petr", "Petrov", Position.junior);
        Date task1Start = new Date(2023, 02, 13);
        Date task1Deadline = new Date(2023, 02,20);
        Task task1 = new Task("Сделать дз к семинару 4", Priority.high, emp1, task1Start, task1Deadline);
        taskBoard.addToTaskBoard(task1);

        Employee emp2 = new Employee("Ivan", "Ivanov", Position.middle);
        Date task2Start = new Date(2023, 02, 20);
        Date task2Deadline = new Date(2023, 02, 30);
        Task task2 = new Task("Выучить Java", Priority.asap, emp2, task2Start, task2Deadline);
        taskBoard.addToTaskBoard(task2);

        Employee emp3 = new Employee("Sergei", "Sergeev", Position.senior);
        Date task3Start = new Date(2023, 02, 24);
        Date task3Deadline = new Date(2023, 02, 31);
        Task task3 = new Task("Очистить доску", Priority.low, emp3, task3Start, task3Deadline);
        taskBoard.addToTaskBoard(task3);

        taskBoard.print();
    }
}
