package org.onehippo.gitinteg.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoHtmlAdapter;

@XmlRootElement(name = "contentdocument")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "gitintegration:contentdocument")
@Node(jcrType = "gitintegration:contentdocument")
public class ContentDocument extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gitintegration:introduction")
    public String getIntroduction() {
        return getProperty("gitintegration:introduction");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "gitintegration:title")
    public String getTitle() {
        return getProperty("gitintegration:title");
    }

    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gitintegration:content")
    public HippoHtml getContent() {
        return getHippoHtml("gitintegration:content");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "gitintegration:publicationdate")
    public Calendar getPublicationDate() {
        return getProperty("gitintegration:publicationdate");
    }
}
