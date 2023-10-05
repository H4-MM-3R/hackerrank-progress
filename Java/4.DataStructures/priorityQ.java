import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student {
  int id;
  String name;
  double cgpa;

  Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }
  public int getID() { return id; }
  public String getName() { return name; }
  public double getCGPA() { return cgpa; }
}
class Priorities {
  List<Student> getStudents(List<String> events) {
    PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> {
      if (a.getCGPA() != b.getCGPA())
        return Double.compare(b.getCGPA(), a.getCGPA());
      else if (!a.getName().equals(b.getName()))
        return a.getName().compareTo(b.getName());
      else
        return Integer.compare(a.getID(), b.getID());
    });

    List<Student> studs = new ArrayList<>();

    for (String event : events) {
      String[] eventArr = event.split(" ");
      if (eventArr[0].equals("ENTER")) {
        String name = eventArr[1];
        double cgpa = Double.parseDouble(eventArr[2]);
        int id = Integer.parseInt(eventArr[3]);
        pq.offer(new Student(id, name, cgpa));
      } else {
        pq.poll();
      }
    }
    while (!pq.isEmpty())
      studs.add(pq.poll());
    return studs;
  }
}
