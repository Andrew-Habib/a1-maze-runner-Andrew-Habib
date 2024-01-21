public class Runner {

    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.EAST;

    public enum Direction {
        NORTH, WEST, EAST, SOUTH
    }

    public Runner(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.direction = dir;
    }

    public void runForward() { 
        if (this.direction == Direction.NORTH) {
            this.y = this.y + 1;
        } else if (this.direction == Direction.SOUTH) {
            this.y = this.y - 1;
        } else if (this.direction == Direction.EAST) {
            this.x = this.x + 1;
        } else {
            this.x = this.x - 1;
        }
    }

    public int getXLocation() { return this.x; }

    public int getYLocation() { return this.y; }

    public Direction getDirection() { return this.direction; }

}