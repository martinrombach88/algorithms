public class Main {
    public static void main(String[] args) {
        BadRequestException example = new BadRequestException("hello");
        System.out.println(example);
    }


    class BadRequestException extends Exception {

        public BadRequestException(String message) {
            super(message);
        }

    }


}
