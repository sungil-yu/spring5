package chap09.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSeller is a Querydsl query type for Seller
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSeller extends EntityPathBase<Seller> {

    private static final long serialVersionUID = 946753593L;

    public static final QSeller seller = new QSeller("seller");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public final StringPath shopName = createString("shopName");

    public QSeller(String variable) {
        super(Seller.class, forVariable(variable));
    }

    public QSeller(Path<? extends Seller> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSeller(PathMetadata<?> metadata) {
        super(Seller.class, metadata);
    }

}

