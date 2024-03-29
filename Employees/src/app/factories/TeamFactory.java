package app.factories;

import app.domain.Team;

public final class TeamFactory {

    public TeamFactory() {
    }

    public static Team execute(long firstEmployeeId, long secondEmployeeId, long overlapDuration) {
        return new Team(
                firstEmployeeId,
                secondEmployeeId,
                overlapDuration);
    }
}
