package app.constants;

public final class Constants {

    private Constants() {
    }
    public static final String FILE_PATH = "src/resources/employees.csv";
    public static final String BEST_TEAM_PATTERN = "The pair of employees which are worked together on joint projects longest are:%n employee with ID: %d & employee with ID: %d with total overlap duration %d days";
    public static final String NO_TEAMS_MSG = "Doesn't exist pair of employees which are worked together on joint projects.";
    public static final int ONE = 1;
    public static final int DEFAULT_OVERLAP_ZERO_DAYS = 0;
    public static final String REGEX_PATTERN = "[ ,]+";
    public static final String NULL_STR = "NULL";
    public static final int INDEX_ONE = 1;
    public static final int INDEX_TWO = 2;
    public static final int INDEX_THREE = 3;
}
