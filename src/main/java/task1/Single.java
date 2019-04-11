package task1;

public class Single implements Expression{
    Integer num;

    public Single(Integer num) {
        this.num = num;
    }

    public Integer expression(){
        return num;
    }
}
