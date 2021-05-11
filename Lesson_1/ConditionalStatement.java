public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 34;
        if(age > 20) {
            System.out.println("Вам больше 20.");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("Вы мужчина.");
        }
        if(!isMale) {
            System.out.println("Вы женщина.");
        }

        float height = 1.75f;
        if(height < 1.80) {
            System.out.println("Вы ниже 1.80.");
        } else {
            System.out.println("Вы выше 1.80.");
        }

        char firstLetterName = 'A';
        if(firstLetterName == 'M') {
            System.out.println("Ваше имя начинается с буквы - " + 'M');
        } else if(firstLetterName == 'I') {
            System.out.println("Ваше имя начинается с буквы - " + 'I');
        } else {
            System.out.println("Ваше имя начинается с буквы - " + firstLetterName);
        } 
    }
}