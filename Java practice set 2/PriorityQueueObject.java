import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueObject{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank =rank;

        }


    @Override
    public int compareTo(Student s2){
        return this.rank -s2.rank;

    }
}

    public static void main (String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("ronak", 1));
        pq.add(new Student("Manu", 2));
        pq.add(new Student("Honney", 8));
        pq.add(new Student("Singh", 5));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"->" +pq.peek().rank);
            pq.remove();
        }




    }
}