package mate.academy.hw10;

// task 1: https://stepik.org/lesson/12773/step/7?unit=3121
public class RobotMover {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isRobotMoved = false;
        for (int i = 0; i < 3 && !isRobotMoved; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                isRobotMoved = true;
            } catch (RobotConnectionException e) {
                System.out.println("Current connection failed, trying again...");
            }
        }
        if (!isRobotMoved) {
            throw new RobotConnectionException("Fail in connection 3 times!");
        }
    }
}
