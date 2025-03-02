package Priority_Queues;

import java.util.PriorityQueue;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class CustomPriorityQueue {
    public static void main(String[] args) {
        // Min-Heap based on student marks
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> a.marks - b.marks);

        // Inserting students
        pq.add(new Student("Alice", 85));
        pq.add(new Student("Bob", 75));
        pq.add(new Student("Charlie", 90));

        // Removing students in order of lowest marks
        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
