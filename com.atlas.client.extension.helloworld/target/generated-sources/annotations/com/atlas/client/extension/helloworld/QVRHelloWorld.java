package com.atlas.client.extension.helloworld;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVRHelloWorld is a Querydsl query type for VRHelloWorld
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVRHelloWorld extends EntityPathBase<VRHelloWorld> {

    private static final long serialVersionUID = -662077720L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVRHelloWorld vRHelloWorld = new QVRHelloWorld("vRHelloWorld");

    public final QVRHelloWorld_VPHelloWorld vpHelloWorld;

    public QVRHelloWorld(String variable) {
        this(VRHelloWorld.class, forVariable(variable), INITS);
    }

    public QVRHelloWorld(Path<? extends VRHelloWorld> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVRHelloWorld(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVRHelloWorld(PathMetadata metadata, PathInits inits) {
        this(VRHelloWorld.class, metadata, inits);
    }

    public QVRHelloWorld(Class<? extends VRHelloWorld> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vpHelloWorld = inits.isInitialized("vpHelloWorld") ? new QVRHelloWorld_VPHelloWorld(forProperty("vpHelloWorld")) : null;
    }

}

