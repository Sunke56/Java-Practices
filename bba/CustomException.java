package bba;

public class CustomException {
    public static void getAge(int age) {
        if (age < 18) {
            try {
                throw new AgeNotValidException("please provide valid Age");
            } catch (AgeNotValidException var2) {
                System.out.println(var2.getMessage());
            }
        } else {
            System.out.println("This is valid age");
        }

    }

    public static void main(String[] args) {
        getAge(19);
    }
}
