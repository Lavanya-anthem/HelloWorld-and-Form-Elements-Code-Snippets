package com.atlas.client.extension.helloworld;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVLHome is a Querydsl query type for VLHome
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVLHome extends EntityPathBase<VLHome> {

    private static final long serialVersionUID = -1972795679L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVLHome vLHome = new QVLHome("vLHome");

    public final QVLHome_VPHome vpHome;

    public QVLHome(String variable) {
        this(VLHome.class, forVariable(variable), INITS);
    }

    public QVLHome(Path<? extends VLHome> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVLHome(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVLHome(PathMetadata metadata, PathInits inits) {
        this(VLHome.class, metadata, inits);
    }

    public QVLHome(Class<? extends VLHome> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vpHome = inits.isInitialized("vpHome") ? new QVLHome_VPHome(forProperty("vpHome")) : null;
    }

}

