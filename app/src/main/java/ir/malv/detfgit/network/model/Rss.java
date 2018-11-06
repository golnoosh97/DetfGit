package ir.malv.detfgit.network.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.net.URL;
import java.util.List;

@Root(name="rss")
public class Rss {


    @Element(name="channel", required=false)
    Channel channel;

    @Attribute(name="version", required=false)
    Double version;


    public Channel getChannel() {return this.channel;}
    public void setChannel(Channel value) {this.channel = value;}

    public Double getVersion() {return this.version;}
    public void setVersion(Double value) {this.version = value;}

    public static class Item {

        @Element(name="enclosure", required=false)
        Enclosure enclosure;

        @Element(name="author", required=false)
        String author;

        @Element(name="link", required=false)
        String link;

        @Element(name="description", required=false)
        String description;

        @Element(name="title", required=false)
        String title;

        @Element(name="pubDate", required=false)
        String pubDate;

        public Enclosure getEnclosure() {return this.enclosure;}
        public void setEnclosure(Enclosure value) {this.enclosure = value;}

        public String getAuthor() {return this.author;}
        public void setAuthor(String value) {this.author = value;}

        public String getLink() {return this.link;}
        public void setLink(String value) {this.link = value;}

        public String getDescription() {return this.description;}
        public void setDescription(String value) {this.description = value;}

        public String getTitle() {return this.title;}
        public void setTitle(String value) {this.title = value;}

        public String getPubDate() {return this.pubDate;}
        public void setPubDate(String value) {this.pubDate = value;}

    }

    public static class Enclosure {

        @Attribute(name="length", required=false)
        Integer length;

        @Attribute(name="type", required=false)
        String type;

        @Attribute(name="url", required=false)
        URL url;

        public Integer getLength() {return this.length;}
        public void setLength(Integer value) {this.length = value;}

        public String getType() {return this.type;}
        public void setType(String value) {this.type = value;}

        public URL getUrl() {return this.url;}
        public void setUrl(URL value) {this.url = value;}

    }

    public static class Channel {

        @ElementList(name="item", required=false, entry="item", inline=true)
        List<Item> item;

        @Element(name="lastBuildDate", required=false)
        String lastBuildDate;

        @Element(name="link", required=false)
        String link;

        @Element(name="description", required=false)
        String description;

        @Element(name="generator", required=false)
        String generator;

        @Element(name="title", required=false)
        String title;

        @Element(name="managingEditor", required=false)
        String managingEditor;

        @Element(name="webMaster", required=false)
        String webMaster;

        public List<Item> getItem() {return this.item;}
        public void setItem(List<Item> value) {this.item = value;}

        public String getLastBuildDate() {return this.lastBuildDate;}
        public void setLastBuildDate(String value) {this.lastBuildDate = value;}

        public String getLink() {return this.link;}
        public void setLink(String value) {this.link = value;}

        public String getDescription() {return this.description;}
        public void setDescription(String value) {this.description = value;}

        public String getGenerator() {return this.generator;}
        public void setGenerator(String value) {this.generator = value;}

        public String getTitle() {return this.title;}
        public void setTitle(String value) {this.title = value;}

        public String getManagingEditor() {return this.managingEditor;}
        public void setManagingEditor(String value) {this.managingEditor = value;}

        public String getWebMaster() {return this.webMaster;}
        public void setWebMaster(String value) {this.webMaster = value;}

    }

}