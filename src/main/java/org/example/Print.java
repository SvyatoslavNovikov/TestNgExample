package org.example;

public class Print {

    public static Message startMessage() {
        return new Message();
    }

    public static class Message {
        private Message() {
            printLine();
        }

        public Message printText(String text) {
            System.out.println(text);
            return this;
        }

        public Message printNullResult(Object object, String paramName) {
            if (object == null) {
                printText(String.format("Переменная %s НЕ ИНИЦИАЛИЗИРОВАННА", paramName));
            } else {
                printText(String.format("Переменная %s ИНИЦИАЛИЗИРОВАННА", paramName));
            }
            return this;
        }

        public void endMessage() {
            printLine();
        }

        private static void printLine() {
            System.out.println("=========================================================================================");
        }

    }
}