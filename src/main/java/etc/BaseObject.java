package etc;

public class BaseObject<T extends BaseObject> {
    private String name;

    public String getName() {
        return this.name;
    }

    public T setName(String name) {
        this.name = name;
        return (T) this;
    }
}

class Story extends BaseObject<Story> {
    private String title;

    public String getTitle() {
        return this.title;
    }

    public Story setTitle(String title) {
        this.title = title;
        return this;
    }

    public static void main(String[] args){
        new Story().setName("Hello").setTitle("World");
    }
}
