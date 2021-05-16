package May2021.codingChallenges;

public class InterviewPart4 {

    public static void main(String[] args) {

        String inputStr = "Hi I can   fly";
        String[] stringArr = inputStr.split(" ");
        int counter = 0;

        for (String s: stringArr) {
            counter++;
            System.out.println(s);
        }

        System.out.println(counter);
    }
}
