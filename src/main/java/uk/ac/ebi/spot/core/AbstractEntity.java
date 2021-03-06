package uk.ac.ebi.spot.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.Identifiable;

import java.util.UUID;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 30/08/17
 */
@Getter
@ToString
@EqualsAndHashCode
public abstract class AbstractEntity implements Identifiable<String> {
    private @Id @JsonIgnore String id;

    private final EntityType type;

    private final UUID uuid;
    private final Accession accession;
    private final SubmissionDate submissionDate;
    private final UpdateDate updateDate;

    protected AbstractEntity(EntityType type, UUID uuid, Accession accession, SubmissionDate submissionDate, UpdateDate updateDate) {
        this.type = type;
        this.uuid = uuid;
        this.accession = accession;
        this.submissionDate = submissionDate;
        this.updateDate = updateDate;
    }
}
