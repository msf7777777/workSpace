package cn.itcast.code.generator.selfgenerator;

public class ET<E,T> {
    private E name;
    private T age;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public ET() {
    }

    public ET(E name, T age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ET{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
