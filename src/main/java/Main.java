import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String path = "L1, L3, L5, L3, R1, L4, L5, R1, R3, L5, R1, L3, L2, L3, R2, R2, L3, L3, R1, L2, R1, L3, L2, R4, R2, L5, R4, L5, R4, L2, R3, L2, R4, R1, L5, L4, R1, L2, R3, R1, R2, L4, R1, L2, R3, L2, L3, R5, L192, R4, L5, R4, L1, R4, L4, R2, L5, R45, L2, L5, R4, R5, L3, R5, R77, R2, R5, L5, R1, R4, L4, L4, R2, L4, L1, R191, R1, L1, L2, L2, L4, L3, R1, L3, R1, R5, R3, L1, L4, L2, L3, L1, L1, R5, L4, R1, L3, R1, L2, R1, R4, R5, L4, L2, R4, R5, L1, L2, R3, L4, R2, R2, R3, L2, L3, L5, R3, R1, L4, L3, R4, R2, R2, R2, R1, L4, R4, R1, R2, R1, L2, L2, R4, L1, L2, R3, L3, L5, L4, R4, L3, L1, L5, L3, L5, R5, L5, L4, L1, R1, L2, L4, L2, L4, L1, R4, R4, R5, R1, L4, R2, L3, L2, L4, R2, L4, L1, L2, R1, R4, R3, R2, R2, R5, L1, L2";
//        String path = "L5, R5, L5, L3";
//        String path = "L510";
//        String path = "R2, L3";
//        String path = "R2, R2, R2";
        Robot robot = new Robot();

        String[] commands = path.split(", ");
        Arrays.stream(commands).forEach(robot::move);
        System.out.println(getDistance(robot.getX(), robot.getY()));
    }

    public static int getDistance(int x, int y){
        if (x < 0){
            x = -x;
        }

        if (y < 0){
            y = -y;
        }
        return x + y;

    }


}