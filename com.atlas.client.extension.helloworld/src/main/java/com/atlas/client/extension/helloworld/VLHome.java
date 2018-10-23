/**
 * 
 */
package com.atlas.client.extension.helloworld;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.Model;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Hints;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Initialize;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Link;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Page;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.PageHeader;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Paragraph;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Section;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Hints.AlignOptions;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.PageHeader.Property;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Section.Type;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Repo.Cache;
import com.antheminc.oss.nimbus.domain.defn.Repo.Database;

import lombok.Getter;
import lombok.Setter;


@Domain(value="home", includeListeners={ListenerType.websocket}) 
@Repo(value = Database.rep_none, cache = Cache.rep_device)
@Getter @Setter
public class VLHome {
	
	@Page private VPHome vpHome;

	@Model @Getter @Setter
	public static class VPHome {
		
		@Section(Type.HEADER) 
		private VSHomeHeader vsHomeHeader;

	}
	@Model @Getter @Setter
	public class VSHomeHeader {
		
	
		@PageHeader(Property.APPTITLE)
		@Paragraph
		@Label(value = "Welcome!")
		private String title;

		
	}
	
}