package chap10;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QParent is a Querydsl query type for Parent
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QParent extends EntityPathBase<Parent> {

    private static final long serialVersionUID = -1839190363L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParent parent = new QParent("parent");

    public final QParentId id;

    public final StringPath id1 = createString("id1");

    public final StringPath id2 = createString("id2");

    public final StringPath name = createString("name");

    public QParent(String variable) {
        this(Parent.class, forVariable(variable), INITS);
    }

    public QParent(Path<? extends Parent> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QParent(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QParent(PathMetadata<?> metadata, PathInits inits) {
        this(Parent.class, metadata, inits);
    }

    public QParent(Class<? extends Parent> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QParentId(forProperty("id")) : null;
    }

}

