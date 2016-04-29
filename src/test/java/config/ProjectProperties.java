package config;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

import java.net.URL;

@Resource.Classpath("project.properties")
public class ProjectProperties {

    @Property("base-url")
    private static URL baseUrl;

    @Property("inbox-url")
    private static URL inboxUrl;

    public ProjectProperties() {
        PropertyLoader.populate(this);
    }

    public static URL getBaseUrl() {
        return baseUrl;
    }

    public static URL getInboxUrl() {
        return inboxUrl;
    }
}
