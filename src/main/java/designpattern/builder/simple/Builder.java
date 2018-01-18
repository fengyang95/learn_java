package designpattern.builder.simple;

public interface Builder {
    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();
}
