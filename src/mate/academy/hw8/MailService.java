package mate.academy.hw8;

import java.util.*;
import java.util.function.*;

// задание ** https://stepik.org/lesson/12781/step/14?unit=3128
public class MailService<T> implements Consumer<Information<T>> {
    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return super.getOrDefault(key, new LinkedList<T>());
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Information<T> information) {
        List<T> list = mailBox.get(information.getTo());
        list.add(information.getContent());
        mailBox.put(information.getTo(), list);
    }
}


