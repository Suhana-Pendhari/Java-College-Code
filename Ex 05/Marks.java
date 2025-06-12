package student;

public class Marks {
    public int math;
    public int science;
    public int english;

    public Marks(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int getTotal() {
        return math + science + english;
    }

    public float getAverage() {
        return getTotal() / 3.0f;
    }
}
