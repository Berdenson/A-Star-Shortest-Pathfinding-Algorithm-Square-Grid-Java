public class main {

    public static void main(String[] args) {

        AStar normalTest = new AStar(0,0, 10, 20);
        System.out.println(normalTest.generateAStarPath());

        AStar sizeTest = new AStar(0, 0, Constants.AStar.FIELD_X*2-1, Constants.AStar.FIELD_Y*2-1);
        System.out.println(sizeTest.generateAStarPath());

    }
}
