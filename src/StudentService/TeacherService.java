package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

/**
 * Сервис Учителя
 */

public class TeacherService implements iUserService<Teacher> {
    private int cnt;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher ter = new Teacher(firstName, secondName, age, cnt++,"");
        teachers.add(ter);
    }

    

    /**
     * сортировка Студента
     * 
     * @return newStudList возвращение отсортированного списка
     */
    public List<Teacher> getSortedByFIOTeacher() {
        List<Teacher> newStudList = new ArrayList<Teacher>(teachers);
        newStudList.sort(new PersonComparator<Teacher>());
        return newStudList;
    }

}