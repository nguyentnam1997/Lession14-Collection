package service;

import entities.Student;
import view.Menu;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    public Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm");
        double score = Double.parseDouble(scanner.nextLine());
        return new Student(name, score);
    }
    public void addStudent(Scanner scanner, Map<Integer, Student> mapStudent) {
        Student student = createStudent(scanner);
        mapStudent.put(student.getId(), student);
    }

//    public Student findById(int id, List<Student> students) {
//        for (Student student :
//                students) {
//            if (student.getId() == id) return student;
//            break;
//        }
//        return null;
//    }
        public Student findById(Scanner scanner, Map<Integer, Student> mapStudent) {
            System.out.println("Mời nhập id muốn tìm:");
            int id = Integer.parseInt(scanner.nextLine());
            Student student = mapStudent.get(id);
            if (student!= null) return student;
            return null;
    }
    public void removeById(Scanner scanner, Map<Integer, Student> mapStudent) {
        System.out.println("Mời nhập id muốn xoá:");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = mapStudent.get(id);
        if (student != null) {
            mapStudent.remove(id);
        }
        else System.out.println("Không tồn tại id");
    }

    public double getAverageScore(Map<Integer, Student> mapStudent) {
        double average = 0;
        for (Map.Entry<Integer, Student> entry: mapStudent.entrySet()) {
            average = average + entry.getValue().getScore();
        }
        return average/ mapStudent.size();
    }
    public void chooseOption(Menu menu, Scanner scanner, Map<Integer, Student> mapStudent) {
        do {
            menu.showMenuOption();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    addStudent(scanner, mapStudent);
                    System.out.println("Đã thêm thành công!");
                    continue;
                }
                case 2 -> {
                    removeById(scanner, mapStudent);
                    System.out.println("Đã xoá thành công!");
                    continue;
                }
                case 3 -> {
                    System.out.println("Sinh viên cần tìm là: " +
                            findById(scanner, mapStudent));
                    continue;
                }
                case 4 -> {
                    System.out.println("Điểm trung bình của tất cả sinh viên là: " + getAverageScore(mapStudent));
                    continue;
                }
            }
            break;
        }
        while (true);

    }
}
