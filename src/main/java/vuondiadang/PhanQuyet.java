package vuondiadang;

public class PhanQuyet {
    public static void main(String[] args) {
        God god = new God();
        Human human = new Human();
        Human Adam = new Human("Adam");
        Human Eva = new Human("Eva");
        Snake snake = new Snake();
        god.GodSay();
        snake.SnakeSay();
        human.eat();
        human.sleep();
        god.ChuaPhanXet();
    }
}
