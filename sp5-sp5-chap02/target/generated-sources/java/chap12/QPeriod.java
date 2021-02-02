package chap12;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPeriod is a Querydsl query type for Period
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QPeriod extends BeanPath<Period> {

    private static final long serialVersionUID = 1650128250L;

    public static final QPeriod period = new QPeriod("period");

    public final DatePath<java.util.Date> endDate = createDate("endDate", java.util.Date.class);

    public final DatePath<java.util.Date> StartDate = createDate("StartDate", java.util.Date.class);

    public QPeriod(String variable) {
        super(Period.class, forVariable(variable));
    }

    public QPeriod(Path<? extends Period> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPeriod(PathMetadata<?> metadata) {
        super(Period.class, metadata);
    }

}

