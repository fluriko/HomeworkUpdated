package mate.academy.hw6;

// задание ** https://stepik.org/lesson/12781/step/14?unit=3128
public class Information<T> {
    private String from;
    private String to;
    private T content;

    public Information(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }
}
