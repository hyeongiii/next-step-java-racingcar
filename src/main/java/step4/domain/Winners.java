package step4.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private final List<String> winnerList = new ArrayList<>();

    public List<String> winners() {
        return winnerList;
    }

    public void addWinner(Car car) {
        winnerList.add(car.name());
    }

}
