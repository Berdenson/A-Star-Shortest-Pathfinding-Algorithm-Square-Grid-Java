import java.util.concurrent.atomic.AtomicReference;

public class main {

    public static void main(String[] args) {

        AStar boundaries = new AStar(Constants.AStar.FIELD_X*2-1, Constants.AStar.FIELD_Y*2-1, 0, 0);
        AtomicReference<Path> path = boundaries.generateAStarPath();
        double maxMemUse = 0;
        while (!path.get().isPathGenerated()) {
            if (Utils.getUsedMem() > maxMemUse) {
                maxMemUse = Utils.getUsedMem();
                System.out.println("New max mem usage at " + System.currentTimeMillis() + ": " + Utils.getUsedMem() + "Kb");
            }
        }
        //AStar sizeTest = new AStar(0, 0, Constants.AStar.FIELD_X*2-1, Constants.AStar.FIELD_Y*2-1);
        //System.out.println(sizeTest.generateAStarPath());

        System.out.println("SLDKFJDSLKFJ");

    }
}
