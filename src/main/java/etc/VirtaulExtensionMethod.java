package etc;

public interface VirtaulExtensionMethod {
    public void doSomeWork();

    default public void doSomeOtherWork() {
        System.out.println("doSomeOtherWork");
    }
}


