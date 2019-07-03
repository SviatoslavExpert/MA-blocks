package com.granovskiy;

abstract class AbstractTemplateMethodProvider {
    //  there are 2 overloaded methods doSmth()
    public void doSmth(String id) {
        // some logic
        String firstName = "";
        String lastName = "";
        doSmth(id, firstName, lastName);
    }

    abstract void doSmth(String id, String firstName, String lastName);
    //  the 2-nd overloaded method will be overridden
}

//    SimpleTemplateMethodProvider is the heir of AbstractTemplateMethodProvider
class SimpleTemplateMethodProvider extends AbstractTemplateMethodProvider {

    @Override
    void doSmth(String id, String firstName, String lastName) {
        System.out.println("From SimpleTemplateMethodProvider");
    }
}

class ComplexTemplateMethodProvider extends AbstractTemplateMethodProvider {

    @Override
    void doSmth(String id, String firstName, String lastName) {
        System.out.println("From ComplexTemplateMethodProvider");
    }
}

public class Demo {

    private void overloaded(String arg1) {
    }

    private void overloaded(String arg1, String arg2) {
    }

    public static void main(String[] args) {
        AbstractTemplateMethodProvider provider = new ComplexTemplateMethodProvider();
        AbstractTemplateMethodProvider provider2 = new SimpleTemplateMethodProvider();
        handleTemplateMethodProvider(provider, "1");
        handleTemplateMethodProvider(provider2, "1");
    }

    private static void handleTemplateMethodProvider(AbstractTemplateMethodProvider provider, String id) {
        provider.doSmth(id);
    }

}
