package com.atlas.client.extension.helloworld;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.MapsTo;
import com.antheminc.oss.nimbus.domain.defn.Model;
import com.antheminc.oss.nimbus.domain.defn.Model.Param.Values.Source;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.MapsTo.Path;
import com.antheminc.oss.nimbus.domain.defn.MapsTo.Type;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Button;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.ButtonGroup;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.CheckBoxGroup;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Form;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Header;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Page;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Paragraph;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Radio;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Section;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Signature;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.StaticText;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.TextBox;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Tile;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.ViewRoot;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;
import com.antheminc.oss.nimbus.domain.model.config.ParamValue;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Domain(value ="helloworldview", includeListeners = {ListenerType.websocket})
@Repo(value=Repo.Database.rep_none,cache=Repo.Cache.rep_device)
@Getter @Setter @ToString(callSuper=true)
@ViewRoot(layout = "home")
public class VRHelloWorld{

	 @Page(defaultPage=true)
	    private VPHelloWorld vpHelloWorld;

@Model
@Getter @Setter
public static class VPHelloWorld{

  @Tile(size = Tile.Size.Large)
  private VTHelloWorld vtHelloWorld;
}

@Model
@Getter @Setter
public static class VTHelloWorld{

 @Header(size=Header.Size.H3)
 private String addHelloWorldHeader;

 @Section
 private VSHelloWorld vsHelloWorld;
}
@Model
@Getter @Setter
public static class VSHelloWorld{

     @Form(cssClass="oneColumn")
     private VFHelloWorld vfHelloWorld;
 }

@Model
 @Getter @Setter
 public static class VFHelloWorld { 
	
	    @Paragraph
		@Label(value = "Hello All!")
		private String title1;

}
}


