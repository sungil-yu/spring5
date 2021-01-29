package chap12;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Period {

	@Temporal(TemporalType.DATE) Date StartDate;
	@Temporal(TemporalType.DATE) Date endDate;
}
