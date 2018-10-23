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

       // Creates a Textbox which is not null and has the label Name
         @TextBox @NotNull
         @Label(" Name") private String name;

        /* Creates a CheckBox which changes on an event
           with the label Choose an option and has options defined
           in YNType.class
        */
         @CheckBoxGroup
	  @Model.Param.Values(value = YNType1.class)
	  @Label(value = "Skill Set") private String checkbox;

      /* Creates a RadioButton which changes on an event
         with the label Choose an option and has options defined
         in YNType.class
      */ @Radio
	  @Model.Param.Values(value = YNType.class)
         @Label(value = "Years of Experience") private String radio;

        /* Creates a Signature box which accepts signature and
           has the label  Signature
        */
         @Signature
         @Label(" Signature") private String signature;

         // Creates a Button with style PRIMARY and has the label Submit
         @Button(style=Button.Style.PRIMARY)
         @Label(" Submit")
         private String submit;
}
        /* YNTypeclass creates a List which accept values of the
           type ParamValue and has values 0-2 yrs,2-5 yrs, Above 5 yrs
        */
    	  public static class YNType implements Source
	  {
	     @Override
	      public List<ParamValue> getValues(String paramPath)
	       {
	         List<ParamValue> values = new ArrayList<>();
	          values.add(new ParamValue("0", "0-2 yrs"));
	          values.add(new ParamValue("2", "2-5 yrs"));
	          values.add(new ParamValue("5", "Above 5 yrs"));
	          return values;
	        }
	   }



        /* YNTypeclass1 creates a List which accept values of the
           type ParamValue and has values Core Java,Spring MVC, Spring Cloud,
           DevOps
        */

	   public static class YNType1 implements Source
	   {
	      @Override
	        public List<ParamValue> getValues(String paramPath)
	         {
	          List<ParamValue> values = new ArrayList<>();
	          values.add(new ParamValue("CJ", "Core Java"));
	          values.add(new ParamValue("SM", "Spring MVC"));
	          values.add(new ParamValue("SC", "Spring Cloud"));
	          values.add(new ParamValue("De", "DevOps"));
	          return values;
	         }
	      }
}


