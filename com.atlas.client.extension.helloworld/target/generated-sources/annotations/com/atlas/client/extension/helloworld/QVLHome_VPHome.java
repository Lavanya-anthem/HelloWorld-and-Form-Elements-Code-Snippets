package com.atlas.client.extension.helloworld;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVLHome_VPHome is a Querydsl query type for VPHome
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QVLHome_VPHome extends BeanPath<VLHome.VPHome> {

    private static final long serialVersionUID = -528132506L;

    public static final QVLHome_VPHome vPHome = new QVLHome_VPHome("vPHome");

    public final SimplePath<VLHome.VSHomeHeader> vsHomeHeader = createSimple("vsHomeHeader", VLHome.VSHomeHeader.class);

    public QVLHome_VPHome(String variable) {
        super(VLHome.VPHome.class, forVariable(variable));
    }

    public QVLHome_VPHome(Path<? extends VLHome.VPHome> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVLHome_VPHome(PathMetadata metadata) {
        super(VLHome.VPHome.class, metadata);
    }

}

