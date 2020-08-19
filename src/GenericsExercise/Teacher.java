package GenericsExercise;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Man<Teacher> {
    public String name;
    public Teacher(String name) {
        this.name = name;
    }
    @Override
    public void run(Teacher o) {
        System.out.println(o.name + "在跑步");
    }

    @Override
    public List<Teacher> getAll() {
        List<Teacher> list = new ArrayList<>();
        Teacher teacherOne = new Teacher("语文老师");
        Teacher teacherTwo = new Teacher("数学老师");
        Teacher teacherThree = new Teacher("物理老师");
        list.add(teacherOne);
        list.add(teacherTwo);
        list.add(teacherThree);
        return list;
    }

    @Override
    public Teacher getProfession() {
        return this;
    }

    public static void main(String[] args) {
        Teacher teacherEnglish = new Teacher("英语老师");
        teacherEnglish.run(teacherEnglish);
    }
}
