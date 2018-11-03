package Bai1;

public abstract class BinaryExpression extends Expression{
    public abstract Expression left();
    public abstract Expression right();

    @Override
    public abstract String toString();

    @Override
    public abstract int evaluate();
}
