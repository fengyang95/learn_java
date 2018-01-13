package other;

class Foo {
    protected class Bar {
        protected Bar() { System.out.println("Foo.Bar"); }
    }
    private Bar b;
    Foo() {
        System.out.println("Foo");
        b = this.new Bar();
    }
}

class FooToo extends Foo  {
    protected class Bar {
        protected Bar() { System.out.println("FootToo.Bar"); }
    }
    public static void main(String[] args) {
        new FooToo();
    }
}