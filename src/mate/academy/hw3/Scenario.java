package mate.academy.hw3;

// задание https://stepik.org/lesson/12762/step/10?unit=3110
public class Scenario {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role);
            result.append(":\n");
            result.append(printTextLine(role, textLines));
            result.append("\n");
        }
        return result.toString();
    }

    public static String printTextLine(String role, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(role + ":")) {
                result.append((i + 1));
                result.append(")");
                result.append(textLines[i].substring(role.length() + 1));
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное " +
                "известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }
}
