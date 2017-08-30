package uk.ac.ebi.spot.submission;

import lombok.Data;
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
public class Protocol extends AbstractEntity {
    protected Protocol(UUID uuid, Accession accession, SubmissionDate submissionDate, UpdateDate updateDate) {
        super(EntityType.PROTOCOL, uuid, accession, submissionDate, updateDate);
    }

}
