public class messageReplacement {
      public static void main(String[] args) {
        String message = "Hello World" + "!!";
        String target = "!";
        String replacement = "*";
        message.replace(target, replacement);
        System.out.println(message.replace(target, replacement));

    }

}