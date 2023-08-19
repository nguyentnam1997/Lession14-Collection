package BaiTapTrenLop;

import BaiTapTrenLop.entities.Student;
import BaiTapTrenLop.service.StudentManagement;
import BaiTapTrenLop.view.Menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Student> mapStudents = new HashMap<>();
        StudentManagement studentManagement = new StudentManagement();
        Menu menu = new Menu();
        studentManagement.chooseOption(menu, scanner, mapStudents);


//        ArrayList<Student> students = new ArrayList<>(
//                Arrays.asList(new Student("Nam", 18),
//                        new Student("Tien", 15),
//                        new Student("Linh", 20))
//        );
//        //Cách 1
////        students.sort(new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
////                return o1.getAge() - o2.getAge();
////            }
////        });
//
//        //Cách 2
//        Collections.sort(students);
//        Iterator<Student> iterator = students.iterator();
////        while (iterator.hasNext()) {
////            //System.out.println(iterator.next());
////        }
//        TreeSet<Student> students1 = new TreeSet<>();
//        students1.descendingSet();
//       //System.out.println(students);
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Nam");  // mỗi 1 cặp key, value được gọi là Entry
//        map.put(2, "Nam2");
//        map.put(3, "Nam3");
//        for (Map.Entry<Integer, String> entry: map.entrySet()) {
//
//        }
//        System.out.println(map.keySet());
    }
}