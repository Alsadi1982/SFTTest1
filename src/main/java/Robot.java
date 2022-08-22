import java.nio.charset.Charset;

public class Robot {

    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.UP;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(String command){

        char direct = command.charAt(0);
        String stepStr = command.substring(1);

        this.turn(direct);
        int step = Integer.parseInt(stepStr);
        switch (this.direction){
            case UP:
                this.y += step;
                break;
            case LEFT:
                this.x -= step;
                break;
            case DOWN:
                this.y -= step;
                break;
            case RIGHT:
                this.x += step;

        }

    }

    private void turn(char direct){

        if (this.direction.equals(Direction.UP) & direct == 'R'){
            this.direction = Direction.RIGHT;
        } else if(this.direction.equals(Direction.UP) & direct == 'L'){
            this.direction = Direction.LEFT;
        } else if (this.direction.equals(Direction.RIGHT) & direct == 'R'){
            this.direction = Direction.DOWN;

        } else if(this.direction.equals(Direction.RIGHT) & direct == 'L'){
            this.direction = Direction.UP;
        } else if (this.direction.equals(Direction.DOWN) & direct == 'R'){
            this.direction = Direction.LEFT;
        } else if(this.direction.equals(Direction.DOWN) & direct == 'L'){
            this.direction = Direction.RIGHT;
        } else if (this.direction.equals(Direction.LEFT) & direct == 'R'){
            this.direction = Direction.UP;
        } else if(this.direction.equals(Direction.LEFT) & direct == 'L'){
            this.direction = Direction.DOWN;
        }
    }
}
