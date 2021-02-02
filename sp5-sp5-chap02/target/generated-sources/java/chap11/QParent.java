package chap11;

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

    private static final long serialVersionUID = -96380028L;

    public static final QParent parent = new QParent("parent");

    public final ListPath<Child, QChild> children = this.<Child, QChild>createList("children", Child.class, QChild.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QParent(String variable) {
        super(Parent.class, forVariable(variable));
    }

    public QParent(Path<? extends Parent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParent(PathMetadata<?> metadata) {
        super(Parent.class, metadata);
    }

}

