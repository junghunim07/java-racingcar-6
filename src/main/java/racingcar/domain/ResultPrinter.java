package racingcar.domain;

import java.util.HashMap;

public class ResultPrinter {
    private static String getUserName = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static String getTry = "시도할 회수는 몇회인가요?";
    private static String winner = "최종 우승자 : ";

    public static void startMessage() {
        System.out.println(getUserName);
    }

    public static void getTryMessage() {
        System.out.println(getTry);
    }

    public static void printCourse(HashMap<String,Integer> race) {
        for (String key : race.keySet()) {
            System.out.print(key + " : ");

            for (int i = 0; i < race.get(key); i++) {
                System.out.print("-");
            }

            System.out.println();
        }

        System.out.println();
    }
}
