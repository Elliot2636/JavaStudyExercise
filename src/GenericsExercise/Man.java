package GenericsExercise;

import java.util.List;

// 泛型接口的定义
public interface Man<T> {
    /**
     *
     * @param t 泛型T作为函数参数的类型
     */
    public void run(T t);

    /**
     *
     * @return 返回值为泛型T类型的对象
     */
    T getProfession();

    /**
     *
     * @return 返回值为泛型T类型的集合
     */
    List<T> getAll();
}
