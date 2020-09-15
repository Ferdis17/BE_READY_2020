package sep_2020;

import java.util.Collections;
import java.util.List;

public class RoadRepairProblem {

    public int getMinCost(List<Integer> crew_id, List<Integer> job_id){

        Collections.sort(crew_id);
        Collections.sort(job_id);

        int count = 0;

        for(int i = 0; i < job_id.size(); i ++)
            count += Math.abs(crew_id.get(i)-job_id.get(i));
        return count;
    }
}
