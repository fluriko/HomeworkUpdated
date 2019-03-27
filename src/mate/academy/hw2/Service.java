package mate.academy.hw2;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// задание 2.6
public class Service {
    // сериализация
    public static void serializeGroup(Group g) throws IOException{
        FileOutputStream os = new FileOutputStream("group.xml");
        XMLEncoder encoder = new XMLEncoder(os);

        encoder.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                System.out.println("Error in serializing!");
            }
        });

        encoder.writeObject(g);
        encoder.close();
        os.close();
    }

    // дессериализация
    public static Group deSerializeGroup() throws IOException{
        FileInputStream is = new FileInputStream("group.xml");
        XMLDecoder decoder = new XMLDecoder(is);
        Group group = (Group) decoder.readObject();
        decoder.close();
        is.close();
        return group;
    }

    public static void main(String[] args) throws IOException{
        // тестировка сериализации
        Group group = new Group();
        group.setCircle(new Circle(15));
        Service.serializeGroup(group);
        System.out.println(group);

        // тестировка десериализации
        Group group1 = Service.deSerializeGroup();
        System.out.println(group1);

    }
}
