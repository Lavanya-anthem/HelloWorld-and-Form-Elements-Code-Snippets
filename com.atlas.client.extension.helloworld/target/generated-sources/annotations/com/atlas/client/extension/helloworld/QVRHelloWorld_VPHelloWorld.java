package com.atlas.client.extension.helloworld;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVRHelloWorld_VPHelloWorld is a Querydsl query type for VPHelloWorld
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QVRHelloWorld_VPHelloWorld extends BeanPath<VRHelloWorld.VPHelloWorld> {

    private static final long serialVersionUID = -80596608L;

    public static final QVRHelloWorld_VPHelloWorld vPHelloWorld = new QVRHelloWorld_VPHelloWorld("vPHelloWorld");

    public final SimplePath<VRHelloWorld.VTHelloWorld> vtHelloWorld = createSimple("vtHelloWorld", VRHelloWorld.VTHelloWorld.class);

    public QVRHelloWorld_VPHelloWorld(String variable) {
        super(VRHelloWorld.VPHelloWorld.class, forVariable(variable));
    }

    public QVRHelloWorld_VPHelloWorld(Path<? extends VRHelloWorld.VPHelloWorld> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVRHelloWorld_VPHelloWorld(PathMetadata metadata) {
        super(VRHelloWorld.VPHelloWorld.class, metadata);
    }

}

