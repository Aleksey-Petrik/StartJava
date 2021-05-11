public class ConditionalStatement{
    public static void main(String[] args){
        int age = 34;
        float height = 1.75f;
        boolean isMale = true;
        char firstChar = 'A';
        if(age > 20) {
            System.out.println("Вам больше 20.");
        }
        if(isMale) {
            System.out.println("Вы мужчина.");
        }
        if(!isMale) {
            System.out.println("Вы женщина.");
        }
        if(height < 1.80) {
            System.out.println("Вы ниже 1.80.");
        } else {
            System.out.println("Вы выше 1.80.");
        }
        if(firstChar == 'M') {
            System.out.println("Ваше имя начинается с буквы - " + 'M');
        } else if(firstChar == 'I') {
            System.out.println("Ваше имя начинается с буквы - " + 'I');
        } else {
            System.out.println("Ваше имя начинается с буквы - " + firstChar);
        } 
    }
}