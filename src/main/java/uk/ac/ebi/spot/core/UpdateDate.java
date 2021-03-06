package uk.ac.ebi.spot.core;

import java.util.Date;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 30/08/17
 */
public class UpdateDate {
    private final Date date;

    protected UpdateDate() {
        this.date = null;
    }

    public UpdateDate(Date date) {
        if (!isValid(date)) {
            throw new IllegalArgumentException(String.format("Update date '%s' is in the future!", date));
        }
        this.date = date;
    }

    public static boolean isValid(Date date) {
        return date.before(new Date());
    }
}
