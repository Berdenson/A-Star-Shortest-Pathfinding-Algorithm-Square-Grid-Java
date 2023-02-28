import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        AStar boundaries = new AStar(0, 0, 123, 45);
        AtomicReference<Path> path = boundaries.generateAStarPath();
        double maxMemUse = 0;
        while (!path.get().isPathGenerated()) {
            if (Utils.getUsedMem() > maxMemUse) {
                maxMemUse = Utils.getUsedMem();
                System.out.println("New max mem usage at " + System.currentTimeMillis() + ": " + Utils.getUsedMem() + "Kb");
            }
        }

        for (int i=0; i<path.get().getPathList().size(); i++) {
//            for (int j=0; j<path.get().getPathList().get(i).length; j++) {
                System.out.println(path.get().getPathList().get(i)[0] + ", " + path.get().getPathList().get(i)[1]);
//            }
        }

        //AStar sizeTest = new AStar(0, 0, Constants.AStar.FIELD_X*2-1, Constants.AStar.FIELD_Y*2-1);
        //System.out.println(sizeTest.generateAStarPath());

        System.out.println("SLDKFJDSLKFJ");

    }
}
