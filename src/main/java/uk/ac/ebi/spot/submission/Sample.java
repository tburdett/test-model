package uk.ac.ebi.spot.submission;

import lombok.Getter;
import uk.ac.ebi.spot.core.*;

import java.util.UUID;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 30/08/17
 */
@Getter
public class Sample extends AbstractEntity {
    protected Sample(UUID uuid, Accession accession, SubmissionDate submissionDate, UpdateDate updateDate) {
        super(EntityType.SAMPLE, uuid, accession, submissionDate, updateDate);
    }
}
