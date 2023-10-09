public class Movement {
    private final int starting_codinate_y =4 ;
    private final int starting_codinate_x =4 ;
    private final Direction starting_direction = Direction.N;

    private int x;
    private int y;
    private Direction direction;
    public void defaultValues(){
        x=starting_codinate_x;
        y=starting_codinate_y;
        direction=starting_direction;
    }
    public void forward (){
        if(direction==Direction.N){
            y++;
        } else if (direction==Direction.S) {
            y--;
        } else if (direction==Direction.E) {
            x++;
        } else if (direction==Direction.W) {
            x--;
        }
    }
    public void backward (){
        if(direction==Direction.N){
            y--;
        } else if (direction==Direction.S) {
            y++;
        } else if (direction==Direction.E) {
            x--;
        } else if (direction==Direction.W) {
            x++;
        }
    }


    public int getStarting_codinate_y() {
        return starting_codinate_y;
    }

    public int getStarting_codinate_x() {
        return starting_codinate_x;
    }

    public Direction getStarting_direction() {
        return starting_direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
