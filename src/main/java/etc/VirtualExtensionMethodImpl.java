package etc;

public class VirtualExtensionMethodImpl implements VirtaulExtensionMethod {

    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork");
    }

    public static void main(String[] args){
        new VirtualExtensionMethodImpl().doSomeWork();
        new VirtualExtensionMethodImpl().doSomeOtherWork();
    }
}