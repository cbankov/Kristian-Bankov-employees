package app.factories;

import app.domain.Record;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static app.constants.Constants.*;
import static app.util.DetermineDatePattern.*;

public final class RecordFactory {


    public RecordFactory() {
    }

    public static Record execute(String line) {
        String[] recordArgs = line.split(REGEX_PATTERN);

        long emplID = Long.parseLong(recordArgs[0].trim());
        long projectID = Long.parseLong(recordArgs[INDEX_ONE].trim());

        //parse both formats by default, add more if needed.
        DateTimeFormatter parser;

        //check date format support. (all included)
        String pattern = determineDateFormat(recordArgs[INDEX_TWO]);

        //set pattern if present or add defaults.
        parser = setPattern(pattern);

        LocalDate dateFrom = LocalDate.parse(recordArgs[INDEX_TWO], parser);

        LocalDate dateTo;
        if (recordArgs[INDEX_THREE] == null || NULL_STR.equals(recordArgs[INDEX_THREE])) {
            //2) DateTo can be „NULL“ (this is equal to today's date)
            dateTo = LocalDate.now();
        } else {
            String pattern2 = determineDateFormat(recordArgs[INDEX_THREE]);
            parser = setPattern(pattern2);
            dateTo = LocalDate.parse(recordArgs[INDEX_THREE], parser);
        }

        return new Record(
                emplID,
                projectID,
                dateFrom,
                dateTo
        );
    }
}
