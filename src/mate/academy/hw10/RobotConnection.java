package mate.academy.hw10;

// task 1: https://stepik.org/lesson/12773/step/7?unit=3121
public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
