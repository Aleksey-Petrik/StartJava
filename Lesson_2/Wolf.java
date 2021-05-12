public class Wolf {
    private char sex;
    private String nickName;
    private float weight; 
    private int age; 
    private String color;

    public void setSex(char sex) {
        this.sex = sex;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }
    public String getNickName() {
        return nickName;
    }
    public float getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Ходит");
    }
    public void sit() {
        System.out.println("Сидит");
    }
    public void run() {
        System.out.println("Бежит");
    }
    public void howl() {
        System.out.println("Воет");
    }
    public void hunt() {
        System.out.println("Охотится");
    }
}
